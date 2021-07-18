package fr.bge.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.bge.facilities.Utils;
import fr.bge.model.TypeSeance;
import fr.bge.service.TypeSeanceService;

/**
 * Servlet implementation class TypeSeanceModifier
 */
@WebServlet(description = "La servlet qui m'affiche la liste des états du matériel", 
urlPatterns = { "/TypeSeanceModifier" })
public class TypeSeanceModifier extends CrclHttpServlet {

	private static final long serialVersionUID = 1L;

	private final TypeSeanceService service = TypeSeanceService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TypeSeanceModifier() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id;
		try {
			id = ServletUtils.getId(request);
		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		TypeSeance etat = this.service.get(id);
		request.setAttribute("entity", etat);
		request.getRequestDispatcher("/jsp/typeSeanceModifier.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id;
		try {
			id = ServletUtils.getId(request);
		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		// 1 extraire les parametres https
		String libelle = request.getParameter("libelle");
		if (libelle == null || libelle.isEmpty()) {
			System.out.println("Le libelle est mal renseigné");
			// la j'ai un premier problème
			return;
		}
		String libelleCourt = request.getParameter("libelleCourt");
		if (libelleCourt == null || libelleCourt.isEmpty()) {
			System.out.println("Le libelleCourt est mal renseigné");
			// la j'ai un premier problème
			return;
		}
		String description = request.getParameter("description");
		if (description == null || description.isEmpty()) {
			System.out.println("Le description est mal renseigné");
			// la j'ai un premier problème
			return;
		}

		Boolean actif = Utils.getBoolean("actif", request);
		// A priori j'ai quelque chose de correct, je vais créer mon entité
		// 2 on remplit l'entité, mais on va gérer ça on niveau du service
		TypeSeance etat = this.service.merge(id, libelle, libelleCourt, description, actif);
		// 3 on sauve l'entité via le service

		this.service.update(etat);


		response.sendRedirect("/crcl/TypeSeanceLister");
	}
}
