package fr.bge.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.bge.facilities.Utils;
import fr.bge.model.Adresse;
import fr.bge.service.AdresseService;

/**
 * Servlet implementation class TypeSeanceModifier
 */
@WebServlet(description = "La servlet qui m'affiche la liste des états du matériel", 
urlPatterns = { "/AdresseModifier" })
public class AdresseModifier extends CrclHttpServlet {

	private static final long serialVersionUID = 1L;

	private final AdresseService service = AdresseService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdresseModifier() {
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
		Adresse adresse = this.service.get(id);
		request.setAttribute("entity", adresse);
		request.getRequestDispatcher("/jsp/adresseModifier.jsp").forward(request, response);
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
		String libelle1 = request.getParameter("libelle1");
		if (libelle1 == null || libelle1.isEmpty()) {
			System.out.println("Le libelle1 est mal renseigné");
			// la j'ai un premier problème
			return;
		}
		String libelle2 = request.getParameter("libelle2");
		if (libelle2 == null || libelle2.isEmpty()) {
			System.out.println("Le libelle2 est mal renseigné");
			// la j'ai un premier problème
			return;
		}
		String codePostal = request.getParameter("codePostal");
		if (codePostal == null || codePostal.isEmpty()) {
			System.out.println("Le codePostal est mal renseigné");
			// la j'ai un premier problème
			return;
		}
		
		String ville = request.getParameter("ville");
		if (ville == null || ville.isEmpty()) {
			System.out.println("La ville est mal renseignée");
			// la j'ai un premier problème
			return;
		}

		
		// A priori j'ai quelque chose de correct, je vais créer mon entité
		// 2 on remplit l'entité, mais on va gérer ça on niveau du service
		Adresse adresse= this.service.merge(id, libelle1,libelle2, codePostal, ville);
		// 3 on sauve l'entité via le service

		this.service.update(adresse);


		response.sendRedirect("/crcl/AdresseLister");
	}
}
