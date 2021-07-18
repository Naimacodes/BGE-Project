package fr.bge.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.model.Adresse;

import fr.bge.service.AdresseService;

/**
 * Servlet implementation class TypeSeanceLister
 */
@WebServlet(description = "La servlet qui m'affiche la liste des types de séance", 
urlPatterns = { "/AdresseVoir" })
public class AdresseVoir extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
	private final AdresseService service = AdresseService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdresseVoir() {
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
		// 1 - il faut aller dans la bdd chercher l'etat matériel qui correspond à l'id
		// 2 - il faudra passer la liste dans les attributs
		request.setAttribute("id", id);
		request.getRequestDispatcher("/jsp/adresseVoir.jsp").forward(request, response);
	}

}
