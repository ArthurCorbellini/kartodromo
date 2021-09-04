package br.univates.kartodromo.model;

import br.univates.kartodromo.model.entity.Marca;
import br.univates.kartodromo.model.entity.Veiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Veiculo.class)
public abstract class Veiculo_ extends br.univates.kartodromo.model.BaseEntity_ {

	public static volatile SingularAttribute<Veiculo, Marca> marca;
	public static volatile SingularAttribute<Veiculo, String> nome;
	public static volatile SingularAttribute<Veiculo, Integer> id;

}

