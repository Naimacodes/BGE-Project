package fr.bge.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CompteRole.class)
public abstract class CompteRole_ {

	public static volatile SingularAttribute<CompteRole, Date> dateCreation;
	public static volatile SingularAttribute<CompteRole, Role> role;
	public static volatile SingularAttribute<CompteRole, CompteRolePK> compteRolePK;
	public static volatile SingularAttribute<CompteRole, Compte> compte;

	public static final String DATE_CREATION = "dateCreation";
	public static final String ROLE = "role";
	public static final String COMPTE_ROLE_PK = "compteRolePK";
	public static final String COMPTE = "compte";

}

