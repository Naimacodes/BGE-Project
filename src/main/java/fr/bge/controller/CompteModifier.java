package fr.bge.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.facilities.Utils;
import fr.bge.model.Compte;
import fr.bge.service.CompteService;

/**
 * Servlet implementation class CompteModifier
 */
@WebServlet(description = "La servlet qui m'affiche la liste des comptes", 
urlPatterns = { "/CompteModifier" })
public class CompteModifier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private final CompteService service = CompteService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CompteModifier() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Long id;
		try {
			id = ServletUtils.getId(request);
		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		Compte compte = this.service.get(id);
		request.setAttribute("e", compte);
		request.getRequestDispatcher("/jsp/compteModifier.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Long id;
		try {
			id = ServletUtils.getId(request);
		} catch (NumberFormatException e) {
			// TODO Gérer le cas de la bad request
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		// 1 extraire les parametres https
		String telephone = request.getParameter("telephone");
		if (telephone == null || telephone.isEmpty()) {
			// TODO retourner vers la jsp et indiquer l'erreur à l'utilisateur : Le telephone est mal renseigné
			System.out.println("Le téléphone est mal renseigné");
			return;
		}
		// A priori j'ai quelque chose de correct, je vais créer mon entité
		// 2 on remplit l'entité, mais on va gérer ça on niveau du service
		Compte compte = this.service.merge(id, telephone);
		// 3 on sauve l'entité via le service
		try {
			this.service.update(compte);
		} catch (Throwable e) {
			Throwable t = Utils.unwrapThrowable(e);
			if (Utils.isReferentialIntegrityConstraint(t)) {
				// TODO retourner vers la jsp et indiquer l'erreur à l'utilisateur : email existe déjà
				System.out.println("Update avec une valeur déjà utilisé dans une colonne Unique");
				return;
			}
		}
		response.sendRedirect("/crcl/CompteLister");
	}		
}

