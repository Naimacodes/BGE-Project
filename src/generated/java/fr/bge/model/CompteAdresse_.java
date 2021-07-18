package fr.bge.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-07-11T17:14:51.155+0200")
@StaticMetamodel(CompteAdresse.class)
public class CompteAdresse_ {
	public static volatile SingularAttribute<CompteAdresse, CompteAdressePK> compteAdressePK;
	public static volatile SingularAttribute<CompteAdresse, Date> dateCreation;
	public static volatile SingularAttribute<CompteAdresse, Adresse> adresse;
	public static volatile SingularAttribute<CompteAdresse, Compte> compte;
}
