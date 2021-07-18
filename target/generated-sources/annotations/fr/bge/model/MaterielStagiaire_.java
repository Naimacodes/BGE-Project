package fr.bge.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MaterielStagiaire.class)
public abstract class MaterielStagiaire_ {

	public static volatile SingularAttribute<MaterielStagiaire, String> commentairePret;
	public static volatile SingularAttribute<MaterielStagiaire, Date> dateRestitution;
	public static volatile SingularAttribute<MaterielStagiaire, Materiel> materiel;
	public static volatile SingularAttribute<MaterielStagiaire, String> commentaireRestitution;
	public static volatile SingularAttribute<MaterielStagiaire, Date> datePret;
	public static volatile SingularAttribute<MaterielStagiaire, Stagiaire> stagiaire;
	public static volatile SingularAttribute<MaterielStagiaire, MaterielStagiairePK> materielStagiairePK;
	public static volatile SingularAttribute<MaterielStagiaire, BigDecimal> caution;
	public static volatile SingularAttribute<MaterielStagiaire, Boolean> cautionRendue;

	public static final String COMMENTAIRE_PRET = "commentairePret";
	public static final String DATE_RESTITUTION = "dateRestitution";
	public static final String MATERIEL = "materiel";
	public static final String COMMENTAIRE_RESTITUTION = "commentaireRestitution";
	public static final String DATE_PRET = "datePret";
	public static final String STAGIAIRE = "stagiaire";
	public static final String MATERIEL_STAGIAIRE_PK = "materielStagiairePK";
	public static final String CAUTION = "caution";
	public static final String CAUTION_RENDUE = "cautionRendue";

}

