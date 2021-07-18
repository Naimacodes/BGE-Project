package fr.bge.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Droit.class)
public abstract class Droit_ {

	public static volatile SingularAttribute<Droit, String> description;
	public static volatile SingularAttribute<Droit, Long> droit;
	public static volatile SingularAttribute<Droit, Boolean> actif;
	public static volatile SingularAttribute<Droit, String> label;

	public static final String DESCRIPTION = "description";
	public static final String DROIT = "droit";
	public static final String ACTIF = "actif";
	public static final String LABEL = "label";

}

