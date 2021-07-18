package fr.bge.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TypeSeance.class)
public abstract class TypeSeance_ {

	public static volatile SingularAttribute<TypeSeance, String> libelle;
	public static volatile SingularAttribute<TypeSeance, String> description;
	public static volatile SingularAttribute<TypeSeance, Boolean> actif;
	public static volatile SingularAttribute<TypeSeance, Long> typeSeance;
	public static volatile SingularAttribute<TypeSeance, String> libelleCourt;

	public static final String LIBELLE = "libelle";
	public static final String DESCRIPTION = "description";
	public static final String ACTIF = "actif";
	public static final String TYPE_SEANCE = "typeSeance";
	public static final String LIBELLE_COURT = "libelleCourt";

}

