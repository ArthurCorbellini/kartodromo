package br.univates.kartodromo.model.entity;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ {

	public static volatile SingularAttribute<Cliente, Long> telefone;
	public static volatile SingularAttribute<Cliente, String> endereco;
	public static volatile SingularAttribute<Cliente, Long> cpf;
	public static volatile SingularAttribute<Cliente, String> nome;
	public static volatile SingularAttribute<Cliente, Integer> id;
	public static volatile SingularAttribute<Cliente, Calendar> dataNascimento;
	public static volatile SingularAttribute<Cliente, String> sexo;
	public static volatile SingularAttribute<Cliente, String> email;
	public static volatile SingularAttribute<Cliente, Long> cep;

	public static final String TELEFONE = "telefone";
	public static final String ENDERECO = "endereco";
	public static final String CPF = "cpf";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String DATA_NASCIMENTO = "dataNascimento";
	public static final String SEXO = "sexo";
	public static final String EMAIL = "email";
	public static final String CEP = "cep";

}

