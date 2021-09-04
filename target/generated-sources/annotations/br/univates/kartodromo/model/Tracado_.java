package br.univates.kartodromo.model;

import br.univates.kartodromo.model.entity.Tracado;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tracado.class)
public abstract class Tracado_ extends br.univates.kartodromo.model.BaseEntity_ {

	public static volatile SingularAttribute<Tracado, BigDecimal> tamanho;
	public static volatile SingularAttribute<Tracado, String> nome;
	public static volatile SingularAttribute<Tracado, Integer> id;

}

