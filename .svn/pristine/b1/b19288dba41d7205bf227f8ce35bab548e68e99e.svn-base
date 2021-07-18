package fr.bge.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.facilities.Utils;
import fr.bge.model.Droit;
import fr.bge.service.DroitService;

/**
 * Servlet implementation class DroitLister
 */
@WebServlet(description = "La servlet affiche une page pour créer un droit.", urlPatterns = { "/DroitCreer" })
public class DroitCreer extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;

	private final DroitService service = DroitService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DroitCreer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/jsp/droitCreer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String label = request.getParameter("label");
		if (label == null || label.isEmpty()) {

			return;
		}
		Boolean isActif = Utils.getBoolean("actif", request);
		String description = request.getParameter("description");

		try {
			Droit droit = this.service.create(label, isActif, description);
			this.service.save(droit);
		} catch (javax.persistence.PersistenceException e) {
			Throwable t = Utils.unwrapThrowable(e);
			if (Utils.isReferentialIntegrityConstraint(t)) {
				System.out.println("Le droit '" + label + "' est déjà dans la bdd.");
			} else {
				throw e;
			}
		}
		response.sendRedirect("/crcl/DroitLister");
	}

}

/*
 * //récupération des données String label = request.getParameter("label");
 * String description = request.getParameter("description"); //String actif =
 * request.getParameter("actif");
 * 
 * //contrôle des données en entrée (cohérentes, présentes)
 * 
 * // par défaut ==> si checkbox non cochée, alors pas de retour dans la jsp //
 * on force à false si pas de retour via la jsp. boolean actif = false; actif =
 * request.getParameter( "actif" ) != null;
 * 
 * 
 * 
 * System.out.
 * println("Coucou je suis rentré dans le post de la jsp Droit Creer ");
 * System.out.println("label : "+ label); System.out.println("description : "+
 * description); System.out.println("actif : "+ actif);
 * response.sendRedirect("DroitLister");
 */
