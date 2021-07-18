package fr.bge.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.facilities.Utils;
import fr.bge.model.Adresse;
import fr.bge.model.CompteRendu;
import fr.bge.model.Formateur;
import fr.bge.model.FormationModule;
import fr.bge.model.Module;
import fr.bge.model.TypeSeance;
import fr.bge.service.AdresseService;
//import fr.bge.service.AdresseService;
import fr.bge.service.CompteRenduService;
import fr.bge.service.FormateurService;
//import fr.bge.service.FormateurService;
import fr.bge.service.ModuleService;
import fr.bge.service.TypeSeanceService;



/**
 * Servlet implementation class CompteRenduLister
 */
@WebServlet(description = "La servlet affiche une page pour créer un compte rendu.", 
urlPatterns = { "/CompteRenduCreer" })
public class CompteRenduCreer extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;

	private final CompteRenduService service = CompteRenduService.getInstance();
	private final TypeSeanceService typeSeanceService = TypeSeanceService.getInstance();
	private final FormateurService formateurService = FormateurService.getInstance();
	private final AdresseService adresseService = AdresseService.getInstance();
	private final ModuleService moduleService = ModuleService.getInstance();
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CompteRenduCreer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// on devrait avoir l'id du compte rendu : creer une compte rendu

		// TODO : filtrer le select uniquement sur ceux qui sont actifs
		List<TypeSeance> typesSeance = this.typeSeanceService.select();
		List<Formateur> formateur = this.formateurService.select();
		List<Adresse> adresse = this.adresseService.select();
		List<Module> module = this.moduleService.select();
		
		
		
		request.setAttribute("typesSeance", typesSeance);
		request.setAttribute("formateur", formateur);
		request.setAttribute("adresse", adresse);
		request.setAttribute("module", module);
		
		request.getRequestDispatcher("/jsp/compteRenduCreer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


 
		//ZONES À PROBLÈMES
		
		//Adresse adresse, 
		//long date, 
		//Formateur formateur, 
		//FormationModule formationModule, 
		//TypeSeance typeSeance, 
		




		// ASSIDUITÉ STAGIAIRE
		Boolean assiduiteStagiaire = Utils.getBoolean("assiduiteStagiaire", request);
		// ASSIDUITÉ STAGIAIRE COMMENTAIRE
		String assiduiteStagiaireCommentaire = request.getParameter("assiduiteStagiaireCommentaire");

		// COMMENTAIRE LIBRE 
		String commentaireLibre = request.getParameter("commentaireLibre");

		
		// COMPRÉHENSION STAGIAIRE
		Boolean comprehensionStagiare = Utils.getBoolean("comprehensionStagiare", request);
		// COMPRÉHENSION STAGIAIRE COMMENTAIRE
		String comprehensionStagiareCommentaire = request.getParameter("comprehensionStagiareCommentaire");


		// CONDITIONS MATERIELLES
		Boolean conditionsMaterielles = Utils.getBoolean("conditionsMaterielles", request);
		// CONDITIONS MATERIELLES COMMENTAIRE
		String conditionsMateriellesCommentaire = request.getParameter("conditionsMateriellesCommentaire");
	

		// CONTENU MODULE RESPECTÉ
		Boolean contenuModuleRespecte = Utils.getBoolean("contenuModuleRespecte", request);
		// CONTENU MODULE RESPECTÉ COMMENTAIRE
		String contenuModuleRespecteCommentaire = request.getParameter("contenuModuleRespecteCommentaire");


		// CONTENU SÉANCE
		String contenuSeance = request.getParameter("contenuSeance");
		if (contenuSeance == null || contenuSeance.isEmpty()) {
			System.out.println("Veuillez renseigner le contenuSeance");
			return;
		}

		// DATE  
		Date date = Utils.getDate("date", request);
		if (date == null ) {
			System.out.println("Veuillez renseigner la date");
			return;
		}
		System.out.println(date);
		
	

		// EVALUATION ACQUIS
		Boolean  evaluationAcquis = Utils.getBoolean("evaluationAcquis", request);

		// EVALUATION ACQUIS COMMENTAIRE
		String evaluationAcquisCommentaire = request.getParameter("evaluationAcquisCommentaire");
		

		// HORAIRE RESPECTÉ
		Boolean horairesRespecte = Utils.getBoolean("horairesRespecte", request);
		// HORAIRE RESPECTÉ COMMENTAIRE
		String horairesRespecteCommentaire = request.getParameter("horairesRespecteCommentaire");

		// PARTICIPATION STAGIAIRE
		Boolean participationStagiare = Utils.getBoolean("participationStagiare", request);
		// PARTICIPATION STAGIAIRE COMMENTAIRE
		String participationStagiareCommentaire = request.getParameter("participationStagiareCommentaire");


		// TIMING RYTHME RESPECTÉ
		Boolean timingRythmeRespecte = Utils.getBoolean("timingRythmeRespecte", request);
		// TIMING RYTHME RESPECTÉ COMMENTAIRE
		String timingRythmeRespecteCommentaire = request.getParameter("timingRythmeRespecteCommentaire");
	
		// VIE DE GROUPE
		Boolean vieDeGroupe = Utils.getBoolean("vieDeGroupe", request);
		// VIE DE GROUPE COMMENTAIRE
		String vieDeGroupeCommentaire = request.getParameter("vieDeGroupeCommentaire");
	
		//ADRESSE
		Long adresse = Utils.getLong("adresse", request);
		
		//FORMATEURS
		Long formateur = Utils.getLong("formateur", request);
		
		//Module
		Long formationModule = Utils.getLong("formationModule", request);
		
		//Type Seance
		Long typeSeance = Utils.getLong("typeSeance", request);
				
				
		/*
		 * try {
			CompteRendu compteRendu = this.service.create(
					assiduiteStagiaireCommentaire );
			// 3 on sauve l'entité via le service
			this.service.save(compteRendu);
		} catch (javax.persistence.PersistenceException e) {
			Throwable t = Utils.unwrapThrowable(e);
			if (Utils.isReferentialIntegrityConstraint(t)) {
				System.out.println("c'est déjà dans la bdd.");
			} else {
				throw e;
			}
		}*/
		
		
		
		
		
		/*
		try {
		 
			CompteRendu compteRendu = this.service.create(
					assiduiteStagiaireCommentaire,  assiduiteStagiaire, 
					commentaireLibre, comprehensionStagiare, 
					comprehensionStagiareCommentaire,conditionsMaterielles,  
					conditionsMateriellesCommentaire, contenuModuleRespecte,  
					contenuModuleRespecteCommentaire,contenuSeance,  
					evaluationAcquis,  evaluationAcquisCommentaire, 
					horairesRespecte,  horairesRespecteCommentaire,  
					participationStagiare,participationStagiareCommentaire,  
					timingRythmeRespecte,  timingRythmeRespecteCommentaire,
					 vieDeGroupe,  vieDeGroupeCommentaire,  adresse, date,
					 formateur, formationModule, typeSeance );
			// 3 on sauve l'entité via le service
			this.service.save(compteRendu);
		} catch (javax.persistence.PersistenceException e) {
			Throwable t = Utils.unwrapThrowable(e);
			if (Utils.isReferentialIntegrityConstraint(t)) {
				System.out.println("c'est déjà dans la bdd.");
			} else {
				throw e;
			}
		}
		*/
	

		response.sendRedirect("/crcl/CompteRenduLister");
	}






}



