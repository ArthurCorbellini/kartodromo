package br.univates.kartodromo.model.entity;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Auditoria.class)
public abstract class Auditoria_ {

	public static volatile SingularAttribute<Auditoria, Calendar> actionTimeStamp;
	public static volatile SingularAttribute<Auditoria, String> query;
	public static volatile SingularAttribute<Auditoria, String> action;
	public static volatile SingularAttribute<Auditoria, String> schemaName;
	public static volatile SingularAttribute<Auditoria, String> userName;
	public static volatile SingularAttribute<Auditoria, String> originalData;
	public static volatile SingularAttribute<Auditoria, Integer> sequenceId;
	public static volatile SingularAttribute<Auditoria, String> newData;
	public static volatile SingularAttribute<Auditoria, String> tableName;

}

