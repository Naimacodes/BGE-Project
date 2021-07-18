package fr.bge.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Stagiaire.class)
public abstract class Stagiaire_ {

	public static volatile SingularAttribute<Stagiaire, Long> stagiaire;
	public static volatile SingularAttribute<Stagiaire, Formation> formation;
	public static volatile SingularAttribute<Stagiaire, Compte> compte;

	public static final String STAGIAIRE = "stagiaire";
	public static final String FORMATION = "formation";
	public static final String COMPTE = "compte";

}

