package br.univates.kartodromo.model.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tracado.class)
public abstract class Tracado_ {

	public static volatile SingularAttribute<Tracado, BigDecimal> tamanho;
	public static volatile SingularAttribute<Tracado, String> dificuldade;
	public static volatile SingularAttribute<Tracado, String> maximo;
	public static volatile SingularAttribute<Tracado, String> nome;
	public static volatile SingularAttribute<Tracado, Integer> id;

	public static final String TAMANHO = "tamanho";
	public static final String DIFICULDADE = "dificuldade";
	public static final String MAXIMO = "maximo";
	public static final String NOME = "nome";
	public static final String ID = "id";

}

