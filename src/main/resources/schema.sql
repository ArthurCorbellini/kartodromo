/* -------------------------------------------------------------------- */
/* ----- Criação do schema/tabela/trigger relacionada à auditoria ----- */
/* -------------------------------------------------------------------- */

/* create a schema named "audit" */
create schema audit;
revoke create on schema audit from public;

create table audit.logged_actions (
    sequence_id serial,
    schema_name text not null,
    table_name text not null,
    user_name text,
    action_tstamp timestamp with time zone not null default current_timestamp,
    action TEXT NOT NULL check (action in ('I','D','U')),
    original_data text,
    new_data text,
    query text,
    PRIMARY KEY (sequence_id)
) with (fillfactor=100);

revoke all on audit.logged_actions from public;

/*
You may wish to use different permissions; this lets anybody
see the full audit data. In Pg 9.0 and above you can use column
permissions for fine-grained control.
*/
grant select on audit.logged_actions to public;

create index logged_actions_schema_table_idx 
on audit.logged_actions(((schema_name||'.'||table_name)::TEXT));

create index logged_actions_action_tstamp_idx 
on audit.logged_actions(action_tstamp);

create index logged_actions_action_idx 
on audit.logged_actions(action);


/* Now, define the actual trigger function */
CREATE OR REPLACE FUNCTION audit.if_modified_func() RETURNS trigger AS $body$
DECLARE
    v_old_data TEXT;
    v_new_data TEXT;
BEGIN
    /*  If this actually for real auditing (where you need to log EVERY action),
        then you would need to use something like dblink or plperl that could log outside the transaction,
        regardless of whether the transaction committed or rolled back.
    */

    /* This dance with casting the NEW and OLD values to a ROW is not necessary in pg 9.0+ */

    if (TG_OP = 'UPDATE') then
        v_old_data := ROW(OLD.*);
        v_new_data := ROW(NEW.*);
        insert into audit.logged_actions (schema_name,table_name,user_name,action,original_data,new_data,query) 
        values (TG_TABLE_SCHEMA::TEXT,TG_TABLE_NAME::TEXT,session_user::TEXT,substring(TG_OP,1,1),v_old_data,v_new_data, current_query());
        RETURN NEW;
    elsif (TG_OP = 'DELETE') then
        v_old_data := ROW(OLD.*);
        insert into audit.logged_actions (schema_name,table_name,user_name,action,original_data,query)
        values (TG_TABLE_SCHEMA::TEXT,TG_TABLE_NAME::TEXT,session_user::TEXT,substring(TG_OP,1,1),v_old_data, current_query());
        RETURN OLD;
    elsif (TG_OP = 'INSERT') then
        v_new_data := ROW(NEW.*);
        insert into audit.logged_actions (schema_name,table_name,user_name,action,new_data,query)
        values (TG_TABLE_SCHEMA::TEXT,TG_TABLE_NAME::TEXT,session_user::TEXT,substring(TG_OP,1,1),v_new_data, current_query());
        RETURN NEW;
    else
        RAISE WARNING '[AUDIT.IF_MODIFIED_FUNC] - Other action occurred: %, at %',TG_OP,now();
        RETURN NULL;
    end if;

EXCEPTION
    WHEN data_exception THEN
        RAISE WARNING '[AUDIT.IF_MODIFIED_FUNC] - UDF ERROR [DATA EXCEPTION] - SQLSTATE: %, SQLERRM: %',SQLSTATE,SQLERRM;
        RETURN NULL;
    WHEN unique_violation THEN
        RAISE WARNING '[AUDIT.IF_MODIFIED_FUNC] - UDF ERROR [UNIQUE] - SQLSTATE: %, SQLERRM: %',SQLSTATE,SQLERRM;
        RETURN NULL;
    WHEN others THEN
        RAISE WARNING '[AUDIT.IF_MODIFIED_FUNC] - UDF ERROR [OTHER] - SQLSTATE: %, SQLERRM: %',SQLSTATE,SQLERRM;
        RETURN NULL;
END;
$body$
LANGUAGE plpgsql
SECURITY DEFINER
SET search_path = pg_catalog, audit;

/*
To add this trigger to a table, use

CREATE TRIGGER tablename_audit
AFTER INSERT OR UPDATE OR DELETE ON tablename
FOR EACH ROW EXECUTE PROCEDURE audit.if_modified_func();
*/

/* -------------------------------------------------------------------- */
/* -------------- Schema de criação das tabelas do banco -------------- */
/* -------------------------------------------------------------------- */

CREATE TABLE IF NOT EXISTS public.clientes
(
    id_cliente serial,
    nm_cliente character varying NOT NULL,
    dt_nascimento date,
    nr_cpf bigint,
    dm_sexo character varying,
    tx_email character varying,
    nr_telefone bigint,
    tx_endereco character varying,
    nr_cep bigint,
    dt_melhor_tempo timestamp without time zone,
    dt_dia_melhor_tempo timestamp with time zone,
    PRIMARY KEY (id_cliente)
);

ALTER TABLE public.clientes
    OWNER to postgres;

CREATE TRIGGER clientes_audit
AFTER INSERT OR UPDATE OR DELETE ON clientes
FOR EACH ROW EXECUTE PROCEDURE audit.if_modified_func();

/* -------------------------------------------------------------------- */

CREATE TABLE IF NOT EXISTS public.usuarios
(
    id_usuario serial,
    tx_login character varying NOT NULL,
    tx_senha character varying NOT NULL,
    nm_nome character varying NOT NULL,
    nr_cpf bigint,
    nr_telefone bigint,
    tx_email character varying,
    dm_perfil character varying,
    dm_sexo character varying,
    PRIMARY KEY (id_usuario)
);

ALTER TABLE public.usuarios
    OWNER to postgres;

CREATE TRIGGER usuarios_audit
AFTER INSERT OR UPDATE OR DELETE ON usuarios
FOR EACH ROW EXECUTE PROCEDURE audit.if_modified_func();

/* -------------------------------------------------------------------- */

CREATE TABLE IF NOT EXISTS public.marcas
(
    id_marca serial,
    nm_marca character varying NOT NULL,
    nm_contato character varying,
    PRIMARY KEY (id_marca)
);

ALTER TABLE public.marcas
    OWNER to postgres;

CREATE TRIGGER marcas_audit
AFTER INSERT OR UPDATE OR DELETE ON marcas
FOR EACH ROW EXECUTE PROCEDURE audit.if_modified_func();

/* -------------------------------------------------------------------- */

CREATE TABLE IF NOT EXISTS public.tracados
(
    id_tracado serial,
    nm_tracado character varying NOT NULL,
    dm_dificuldade character varying NOT NULL,
    vl_maximo bigint,
    vl_tamanho bigint,
    PRIMARY KEY (id_tracado)
);

ALTER TABLE public.tracados
    OWNER to postgres;

CREATE TRIGGER tracados_audit
AFTER INSERT OR UPDATE OR DELETE ON tracados
FOR EACH ROW EXECUTE PROCEDURE audit.if_modified_func();

/* -------------------------------------------------------------------- */

CREATE TABLE IF NOT EXISTS public.veiculos
(
    id_veiculo serial,
    nm_veiculo character varying NOT NULL,
    id_marca character varying,
    PRIMARY KEY (id_veiculo)
);

ALTER TABLE public.veiculos
    OWNER to postgres;

CREATE TRIGGER veiculos_audit
AFTER INSERT OR UPDATE OR DELETE ON veiculos
FOR EACH ROW EXECUTE PROCEDURE audit.if_modified_func();
