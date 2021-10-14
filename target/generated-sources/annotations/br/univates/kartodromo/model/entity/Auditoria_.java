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

	public static final String ACTION_TIME_STAMP = "actionTimeStamp";
	public static final String QUERY = "query";
	public static final String ACTION = "action";
	public static final String SCHEMA_NAME = "schemaName";
	public static final String USER_NAME = "userName";
	public static final String ORIGINAL_DATA = "originalData";
	public static final String SEQUENCE_ID = "sequenceId";
	public static final String NEW_DATA = "newData";
	public static final String TABLE_NAME = "tableName";

}

