/* -------------------------------------------------------------------- */
/* --------------- Inserção dos Registros nas tabelas ----------------- */
/* -------------------------------------------------------------------- */

insert into usuarios (tx_login, tx_senha, nm_nome, nr_cpf, nr_telefone, tx_email, dm_perfil, dm_sexo)
values ('adm', 'b09c600fddc573f117449b3723f23d64', 'Administrador', '12345610001', '999999999', 'teste@gmail.com', 'ADMIN', 'M')
,      ('arthur', 'b09c600fddc573f117449b3723f23d64', 'Arthur Corbellini', '12345610001', '999999999', 'teste@gmail.com', 'PADRAO', 'M')
,      ('ricardo', 'b09c600fddc573f117449b3723f23d64', 'Ricardo Fulano', '12345610001', '999999999', 'teste@gmail.com', 'PADRAO', 'M')
,      ('marcelo', 'b09c600fddc573f117449b3723f23d64', 'Marcelo Beltrano', '12345610001', '999999999', 'teste@gmail.com', 'PADRAO', 'M')
,      ('jorge', 'b09c600fddc573f117449b3723f23d64', 'Jorge', '12345610001', '999999999', 'teste@gmail.com', 'PADRAO', 'M')
,      ('daiana', 'b09c600fddc573f117449b3723f23d64', 'Daiana Fulana', '12345610001', '999999999', 'teste@gmail.com', 'PADRAO', 'F')
,      ('ana', 'b09c600fddc573f117449b3723f23d64', 'Ana Beltrana', '12345610001', '999999999', 'teste@gmail.com', 'PADRAO', 'F')
,      ('roberto', 'b09c600fddc573f117449b3723f23d64', 'Roberto Beltrano', '12345610001', '999999999', 'teste@gmail.com', 'PADRAO', 'M')
,      ('thais', 'b09c600fddc573f117449b3723f23d64', 'Thais Condida', '12345610001', '999999999', 'teste@gmail.com', 'PADRAO', 'F')
,      ('rodrigo', 'b09c600fddc573f117449b3723f23d64', 'Rodrigo Fulano', '12345610001', '999999999', 'teste@gmail.com', 'PADRAO', 'M')
,      ('felipe', 'b09c600fddc573f117449b3723f23d64', 'Felipe Beltrano', '12345610001', '999999999', 'teste@gmail.com', 'PADRAO', 'M')
,      ('rodolfo', 'b09c600fddc573f117449b3723f23d64', 'Rodolfo Ciclano', '12345610001', '999999999', 'teste@gmail.com', 'PADRAO', 'M')
,      ('gabriela', 'b09c600fddc573f117449b3723f23d64', 'Gabriela Fulana', '12345610001', '999999999', 'teste@gmail.com', 'PADRAO', 'F')
,      ('marcela', 'b09c600fddc573f117449b3723f23d64', 'Marcela Beltrana', '12345610001', '999999999', 'teste@gmail.com', 'PADRAO', 'F')
,      ('maria', 'b09c600fddc573f117449b3723f23d64', 'Maria Beltrano', '12345610001', '999999999', 'teste@gmail.com', 'PADRAO', 'F')
,      ('nina', 'b09c600fddc573f117449b3723f23d64', 'Nina Fulana', '12345610001', '999999999', 'teste@gmail.com', 'PADRAO', 'F')
;

insert into clientes (nm_cliente, nr_cpf, nr_telefone, tx_email, tx_endereco, dm_sexo, dt_melhor_tempo, dt_dia_melhor_tempo)
values ('Joaozinho', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'M', '1970-01-01 00:01:40.410677', '2021-07-07 00:00:00')
,      ('Arthur Corbellini', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'M', '1970-01-01 00:01:39.410677', '2021-07-07 00:00:00')
,      ('Ricardo Fulano', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'M', '1970-01-01 00:01:38.410677', '2021-08-07 00:00:00')
,      ('Marcelo Beltrano', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'M', '1970-01-01 00:01:20.410677', '2021-08-12 00:00:00')
,      ('Jorge', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'M', '1970-01-01 00:01:22.410677', '2021-11-07 00:00:00')
,      ('Daiana Fulana', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'F', '1970-01-01 00:01:22.410677', '2021-11-07 00:00:00')
,      ('Ana Beltrana', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'F', '1970-01-01 00:01:22.410677', '2021-11-07 00:00:00')
,      ('Roberto Beltrano', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'M', '1970-01-01 00:01:20.410677', '2021-07-07 00:00:00')
,      ('Thais Condida', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'F', '1970-01-01 00:01:19.410677', '2021-07-07 00:00:00')
,      ('Rodrigo Fulano', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'M', '1970-01-01 00:01:40.410677', '2021-07-07 00:00:00')
,      ('Felipe Beltrano', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'M', '1970-01-01 00:01:50.410677', '2021-07-07 00:00:00')
,      ('Rodolfo Ciclano', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'M', '1970-01-01 00:01:51.410677', '2021-07-07 00:00:00')
,      ('Gabriela Fulana', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'F', '1970-01-01 00:01:55.410677', '2021-07-07 00:00:00')
,      ('Marcela Beltrana', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'F', '1970-01-01 00:01:58.410677', '2021-08-07 00:00:00')
,      ('Maria Beltrano', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'F', '1970-01-01 00:01:59.410677', '2021-08-07 00:00:00')
,      ('Nina Fulana', '12345610001', '999999999', 'teste@gmail.com', 'Rua dos Bobos', 'F', '1970-01-01 00:01:17.410677', '2021-08-07 00:00:00')
;

insert into veiculos (nm_veiculo, id_marca)
values ('Carro A', '1')
,      ('Carro B', '1')
,      ('Carro C', '1')
,      ('Carro D', '1')
,      ('Carro E', '1')
,      ('Carro F', '1')
,      ('Carro G', '1')
,      ('Carro H', '1')
,      ('Carro I', '1')
;

insert into tracados (nm_tracado, dm_dificuldade, vl_maximo, vl_tamanho)
values ('Traçado A', '1', '60', '1000')
,      ('Traçado B', '1', '50', '600')
,      ('Traçado C', '2', '40', '600')
,      ('Traçado D', '2', '60', '800')
,      ('Traçado E', '3', '50', '700')
,      ('Traçado F', '3', '50', '600')
;

update tracados set nm_tracado = 'Traçado Alterado A' where id_tracado = '1';
update veiculos set id_marca = '2' where id_veiculo = '1';
update veiculos set id_marca = '2' where id_veiculo = '2';
update tracados set nm_tracado = 'Traçado Alterado A' where id_tracado = '1';
update veiculos set id_marca = '2' where id_veiculo = '1';
update veiculos set id_marca = '2' where id_veiculo = '2';
update tracados set nm_tracado = 'Traçado Alterado A' where id_tracado = '1';
update veiculos set id_marca = '2' where id_veiculo = '1';
update veiculos set id_marca = '2' where id_veiculo = '2';
update tracados set nm_tracado = 'Traçado Alterado A' where id_tracado = '1';
update veiculos set id_marca = '2' where id_veiculo = '1';
update veiculos set id_marca = '2' where id_veiculo = '2';
