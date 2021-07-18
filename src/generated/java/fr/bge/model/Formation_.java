package fr.bge.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-07-11T17:26:21.960+0200")
@StaticMetamodel(Formation.class)
public class Formation_ {
	public static volatile SingularAttribute<Formation, Long> formation;
	public static volatile SingularAttribute<Formation, Date> dateDebut;
	public static volatile SingularAttribute<Formation, Date> dateFin;
	public static volatile SingularAttribute<Formation, String> intitule;
	public static volatile SingularAttribute<Formation, Integer> nombreJours;
	public static volatile SingularAttribute<Formation, Integer> nombrePlaces;
	public static volatile SingularAttribute<Formation, String> reference;
	public static volatile SingularAttribute<Formation, Compte> referentFormation;
	public static volatile SingularAttribute<Formation, Adresse> adresse;
	public static volatile SingularAttribute<Formation, ModeFormation> modeFormation;
}
