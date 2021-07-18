package fr.bge.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Formation.class)
public abstract class Formation_ {

	public static volatile SingularAttribute<Formation, String> reference;
	public static volatile SingularAttribute<Formation, Compte> referentFormation;
	public static volatile SingularAttribute<Formation, Integer> nombrePlaces;
	public static volatile SingularAttribute<Formation, Integer> nombreJours;
	public static volatile SingularAttribute<Formation, ModeFormation> modeFormation;
	public static volatile SingularAttribute<Formation, Date> dateDebut;
	public static volatile SingularAttribute<Formation, Adresse> adresse;
	public static volatile SingularAttribute<Formation, Long> formation;
	public static volatile SingularAttribute<Formation, Date> dateFin;
	public static volatile SingularAttribute<Formation, String> intitule;

	public static final String REFERENCE = "reference";
	public static final String REFERENT_FORMATION = "referentFormation";
	public static final String NOMBRE_PLACES = "nombrePlaces";
	public static final String NOMBRE_JOURS = "nombreJours";
	public static final String MODE_FORMATION = "modeFormation";
	public static final String DATE_DEBUT = "dateDebut";
	public static final String ADRESSE = "adresse";
	public static final String FORMATION = "formation";
	public static final String DATE_FIN = "dateFin";
	public static final String INTITULE = "intitule";

}

