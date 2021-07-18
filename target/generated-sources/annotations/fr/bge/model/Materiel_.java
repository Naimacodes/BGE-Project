package fr.bge.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Materiel.class)
public abstract class Materiel_ {

	public static volatile SingularAttribute<Materiel, Long> materiel;
	public static volatile SingularAttribute<Materiel, String> reference;
	public static volatile SingularAttribute<Materiel, String> designation;
	public static volatile SingularAttribute<Materiel, TypeMateriel> typeMateriel;
	public static volatile SingularAttribute<Materiel, EtatMateriel> etatMateriel;

	public static final String MATERIEL = "materiel";
	public static final String REFERENCE = "reference";
	public static final String DESIGNATION = "designation";
	public static final String TYPE_MATERIEL = "typeMateriel";
	public static final String ETAT_MATERIEL = "etatMateriel";

}

