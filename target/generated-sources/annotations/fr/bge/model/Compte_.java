package fr.bge.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Compte.class)
public abstract class Compte_ {

	public static volatile SingularAttribute<Compte, String> motDePasse;
	public static volatile SingularAttribute<Compte, String> telephone;
	public static volatile SingularAttribute<Compte, String> nom;
	public static volatile SingularAttribute<Compte, String> prenom;
	public static volatile SingularAttribute<Compte, String> email;
	public static volatile SingularAttribute<Compte, Long> compte;

	public static final String MOT_DE_PASSE = "motDePasse";
	public static final String TELEPHONE = "telephone";
	public static final String NOM = "nom";
	public static final String PRENOM = "prenom";
	public static final String EMAIL = "email";
	public static final String COMPTE = "compte";

}

