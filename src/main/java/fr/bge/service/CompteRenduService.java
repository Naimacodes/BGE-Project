package fr.bge.service;


import java.util.Date;
import java.util.List;

import fr.bge.dao.CRUDable;
import fr.bge.dao.CompteRenduDao;
import fr.bge.model.Adresse;
import fr.bge.model.CompteRendu;
import fr.bge.model.Formateur;
import fr.bge.model.FormationModule;
import fr.bge.model.TypeSeance;

public class CompteRenduService implements CRUDable<CompteRendu, Long> {

	private CompteRenduDao dao = CompteRenduDao.getInstance(); 
	
	private final static CompteRenduService INSTANCE = new CompteRenduService();
	
	private CompteRenduService() {
		
	}
	
	public static CompteRenduService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public Long save(CompteRendu obj) {
		return this.dao.save(obj);
	}

	@Override
	public CompteRendu get(Long id) {
		return this.dao.get(id);
	}

	@Override
	public CompteRendu remove(Long id) {
		return this.dao.remove(id);
	}

	@Override
	public List<CompteRendu> select() {
		return this.dao.select();
	}

	@Override
	public void update(CompteRendu obj) {
		// TODO Auto-generated method stub
		
	}

	public boolean exist(String compteRendu) {
		// TODO Auto-generated method stub
		return false;
	}

	 public CompteRendu create(String assiduiteStagiaireCommentaire, Boolean assiduiteStagiaire, String commentaireLibre,
Boolean comprehensionStagiare, String comprehensionStagiareCommentaire, 
Boolean conditionsMaterielles, String conditionsMateriellesCommentaire, 
Boolean contenuModuleRespecte, String contenuModuleRespecteCommentaire,
String contenuSeance, Boolean evaluationAcquis, String evaluationAcquisCommentaire,
Boolean horairesRespecte, String horairesRespecteCommentaire, Boolean participationStagiare, 
String participationStagiareCommentaire, Boolean timingRythmeRespecte, 
String timingRythmeRespecteCommentaire,  Boolean vieDeGroupe, String vieDeGroupeCommentaire,
Adresse adresse, Date date, Formateur formateur, FormationModule formationModule, 
TypeSeance typeSeance) {
	 
		CompteRendu compteRendu = new CompteRendu();
		compteRendu.setAssiduiteStagiaireCommentaire(assiduiteStagiaireCommentaire);
		compteRendu.setAssiduiteStagiaire(assiduiteStagiaire);
		compteRendu.setAdresse(adresse);
		compteRendu.setCommentaireLibre(commentaireLibre);
		compteRendu.setComprehensionStagiare(comprehensionStagiare);
		compteRendu.setComprehensionStagiareCommentaire(comprehensionStagiareCommentaire);
		compteRendu.setConditionsMaterielles(conditionsMaterielles);
		compteRendu.setConditionsMateriellesCommentaire(conditionsMateriellesCommentaire);
		compteRendu.setContenuModuleRespecte(contenuModuleRespecte);
		compteRendu.setContenuModuleRespecteCommentaire(contenuModuleRespecteCommentaire);
		compteRendu.setContenuSeance(contenuSeance);
		compteRendu.setDate(date);
		compteRendu.setEvaluationAcquis(evaluationAcquis );
		compteRendu.setEvaluationAcquisCommentaire(evaluationAcquisCommentaire);
		compteRendu.setFormateur(formateur);
		compteRendu.setFormationModule(formationModule);
		compteRendu.setHorairesRespecte(horairesRespecte);
		compteRendu.setHorairesRespecteCommentaire(horairesRespecteCommentaire);
		compteRendu.setParticipationStagiare(participationStagiare);
		compteRendu.setParticipationStagiareCommentaire(participationStagiareCommentaire);
		compteRendu.setTimingRythmeRespecte(timingRythmeRespecte);
		compteRendu.setTimingRythmeRespecteCommentaire(timingRythmeRespecteCommentaire);
		compteRendu.setTypeSeance(typeSeance);
		compteRendu.setVieDeGroupe(vieDeGroupe);
		compteRendu.setVieDeGroupeCommentaire(vieDeGroupeCommentaire);

		return compteRendu;
	}


	/*public CompteRendu create(String assiduiteStagiaireCommentaire ) {
		CompteRendu compteRendu = new CompteRendu();
		compteRendu.setAssiduiteStagiaireCommentaire(assiduiteStagiaireCommentaire);

		return compteRendu;
	}*/

}
