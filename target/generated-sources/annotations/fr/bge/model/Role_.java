package fr.bge.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Role.class)
public abstract class Role_ {

	public static volatile SingularAttribute<Role, Long> role;
	public static volatile SingularAttribute<Role, String> description;
	public static volatile SingularAttribute<Role, Boolean> actif;
	public static volatile SingularAttribute<Role, String> label;

	public static final String ROLE = "role";
	public static final String DESCRIPTION = "description";
	public static final String ACTIF = "actif";
	public static final String LABEL = "label";

}

