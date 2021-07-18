package fr.bge.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CompteAdresse.class)
public abstract class CompteAdresse_ {

	public static volatile SingularAttribute<CompteAdresse, Date> dateCreation;
	public static volatile SingularAttribute<CompteAdresse, Adresse> adresse;
	public static volatile SingularAttribute<CompteAdresse, CompteAdressePK> compteAdressePK;
	public static volatile SingularAttribute<CompteAdresse, Compte> compte;

	public static final String DATE_CREATION = "dateCreation";
	public static final String ADRESSE = "adresse";
	public static final String COMPTE_ADRESSE_PK = "compteAdressePK";
	public static final String COMPTE = "compte";

}

