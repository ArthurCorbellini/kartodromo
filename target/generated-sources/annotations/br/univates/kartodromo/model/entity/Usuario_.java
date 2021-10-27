package br.univates.kartodromo.model.entity;

import br.univates.kartodromo.model.type.PerfilType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, String> senha;
	public static volatile SingularAttribute<Usuario, Long> telefone;
	public static volatile SingularAttribute<Usuario, Long> cpf;
	public static volatile SingularAttribute<Usuario, String> nome;
	public static volatile SingularAttribute<Usuario, Integer> id;
	public static volatile SingularAttribute<Usuario, String> login;
	public static volatile SingularAttribute<Usuario, String> sexo;
	public static volatile SingularAttribute<Usuario, String> email;
	public static volatile SingularAttribute<Usuario, PerfilType> perfil;

	public static final String SENHA = "senha";
	public static final String TELEFONE = "telefone";
	public static final String CPF = "cpf";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String LOGIN = "login";
	public static final String SEXO = "sexo";
	public static final String EMAIL = "email";
	public static final String PERFIL = "perfil";

}

