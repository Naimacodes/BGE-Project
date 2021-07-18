package fr.bge.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-07-15T14:10:00.904+0200")
@StaticMetamodel(CompteRendu.class)
public class CompteRendu_ {
	public static volatile SingularAttribute<CompteRendu, Long> compteRendu;
	public static volatile SingularAttribute<CompteRendu, Boolean> assiduiteStagiaire;
	public static volatile SingularAttribute<CompteRendu, String> assiduiteStagiaireCommentaire;
	public static volatile SingularAttribute<CompteRendu, String> commentaireLibre;
	public static volatile SingularAttribute<CompteRendu, Boolean> comprehensionStagiare;
	public static volatile SingularAttribute<CompteRendu, String> comprehensionStagiareCommentaire;
	public static volatile SingularAttribute<CompteRendu, Boolean> conditionsMaterielles;
	public static volatile SingularAttribute<CompteRendu, String> conditionsMateriellesCommentaire;
	public static volatile SingularAttribute<CompteRendu, Boolean> contenuModuleRespecte;
	public static volatile SingularAttribute<CompteRendu, String> contenuModuleRespecteCommentaire;
	public static volatile SingularAttribute<CompteRendu, String> contenuSeance;
	public static volatile SingularAttribute<CompteRendu, Date> date;
	public static volatile SingularAttribute<CompteRendu, Boolean> evaluationAcquis;
	public static volatile SingularAttribute<CompteRendu, String> evaluationAcquisCommentaire;
	public static volatile SingularAttribute<CompteRendu, Boolean> horairesRespecte;
	public static volatile SingularAttribute<CompteRendu, String> horairesRespecteCommentaire;
	public static volatile SingularAttribute<CompteRendu, Boolean> participationStagiare;
	public static volatile SingularAttribute<CompteRendu, String> participationStagiareCommentaire;
	public static volatile SingularAttribute<CompteRendu, Boolean> timingRythmeRespecte;
	public static volatile SingularAttribute<CompteRendu, String> timingRythmeRespecteCommentaire;
	public static volatile SingularAttribute<CompteRendu, Boolean> vieDeGroupe;
	public static volatile SingularAttribute<CompteRendu, String> vieDeGroupeCommentaire;
	public static volatile SingularAttribute<CompteRendu, Formateur> formateur;
	public static volatile SingularAttribute<CompteRendu, TypeSeance> typeSeance;
	public static volatile SingularAttribute<CompteRendu, Adresse> adresse;
	public static volatile SingularAttribute<CompteRendu, FormationModule> formationModule;
}
