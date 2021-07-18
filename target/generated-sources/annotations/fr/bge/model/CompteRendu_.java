package fr.bge.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CompteRendu.class)
public abstract class CompteRendu_ {

	public static volatile SingularAttribute<CompteRendu, Date> date;
	public static volatile SingularAttribute<CompteRendu, Long> compteRendu;
	public static volatile SingularAttribute<CompteRendu, Boolean> conditionsMaterielles;
	public static volatile SingularAttribute<CompteRendu, Boolean> participationStagiare;
	public static volatile SingularAttribute<CompteRendu, Boolean> vieDeGroupe;
	public static volatile SingularAttribute<CompteRendu, Boolean> horairesRespecte;
	public static volatile SingularAttribute<CompteRendu, String> assiduiteStagiaireCommentaire;
	public static volatile SingularAttribute<CompteRendu, Boolean> contenuModuleRespecte;
	public static volatile SingularAttribute<CompteRendu, Formateur> formateur;
	public static volatile SingularAttribute<CompteRendu, Boolean> comprehensionStagiare;
	public static volatile SingularAttribute<CompteRendu, Boolean> timingRythmeRespecte;
	public static volatile SingularAttribute<CompteRendu, Boolean> evaluationAcquis;
	public static volatile SingularAttribute<CompteRendu, String> evaluationAcquisCommentaire;
	public static volatile SingularAttribute<CompteRendu, String> horairesRespecteCommentaire;
	public static volatile SingularAttribute<CompteRendu, String> conditionsMateriellesCommentaire;
	public static volatile SingularAttribute<CompteRendu, FormationModule> formationModule;
	public static volatile SingularAttribute<CompteRendu, String> contenuSeance;
	public static volatile SingularAttribute<CompteRendu, TypeSeance> typeSeance;
	public static volatile SingularAttribute<CompteRendu, String> commentaireLibre;
	public static volatile SingularAttribute<CompteRendu, String> participationStagiareCommentaire;
	public static volatile SingularAttribute<CompteRendu, String> timingRythmeRespecteCommentaire;
	public static volatile SingularAttribute<CompteRendu, String> comprehensionStagiareCommentaire;
	public static volatile SingularAttribute<CompteRendu, String> vieDeGroupeCommentaire;
	public static volatile SingularAttribute<CompteRendu, Boolean> assiduiteStagiaire;
	public static volatile SingularAttribute<CompteRendu, String> contenuModuleRespecteCommentaire;
	public static volatile SingularAttribute<CompteRendu, Adresse> adresse;

	public static final String DATE = "date";
	public static final String COMPTE_RENDU = "compteRendu";
	public static final String CONDITIONS_MATERIELLES = "conditionsMaterielles";
	public static final String PARTICIPATION_STAGIARE = "participationStagiare";
	public static final String VIE_DE_GROUPE = "vieDeGroupe";
	public static final String HORAIRES_RESPECTE = "horairesRespecte";
	public static final String ASSIDUITE_STAGIAIRE_COMMENTAIRE = "assiduiteStagiaireCommentaire";
	public static final String CONTENU_MODULE_RESPECTE = "contenuModuleRespecte";
	public static final String FORMATEUR = "formateur";
	public static final String COMPREHENSION_STAGIARE = "comprehensionStagiare";
	public static final String TIMING_RYTHME_RESPECTE = "timingRythmeRespecte";
	public static final String EVALUATION_ACQUIS = "evaluationAcquis";
	public static final String EVALUATION_ACQUIS_COMMENTAIRE = "evaluationAcquisCommentaire";
	public static final String HORAIRES_RESPECTE_COMMENTAIRE = "horairesRespecteCommentaire";
	public static final String CONDITIONS_MATERIELLES_COMMENTAIRE = "conditionsMateriellesCommentaire";
	public static final String FORMATION_MODULE = "formationModule";
	public static final String CONTENU_SEANCE = "contenuSeance";
	public static final String TYPE_SEANCE = "typeSeance";
	public static final String COMMENTAIRE_LIBRE = "commentaireLibre";
	public static final String PARTICIPATION_STAGIARE_COMMENTAIRE = "participationStagiareCommentaire";
	public static final String TIMING_RYTHME_RESPECTE_COMMENTAIRE = "timingRythmeRespecteCommentaire";
	public static final String COMPREHENSION_STAGIARE_COMMENTAIRE = "comprehensionStagiareCommentaire";
	public static final String VIE_DE_GROUPE_COMMENTAIRE = "vieDeGroupeCommentaire";
	public static final String ASSIDUITE_STAGIAIRE = "assiduiteStagiaire";
	public static final String CONTENU_MODULE_RESPECTE_COMMENTAIRE = "contenuModuleRespecteCommentaire";
	public static final String ADRESSE = "adresse";

}

