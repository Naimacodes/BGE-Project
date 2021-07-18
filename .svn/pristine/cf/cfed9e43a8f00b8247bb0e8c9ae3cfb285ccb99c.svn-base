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
 * Servlet implementation class CompteCreer
 */
@WebServlet("/CompteCreer")
public class CompteCreer extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
	private final CompteService service = CompteService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CompteCreer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/jsp/compteCreer.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		if (email == null || email.isEmpty()) {
			response.sendRedirect("CompteCreer");
		} else {

			String motDePasse = Utils.hashageSHA256(request.getParameter("motDePasse"));
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String telephone = request.getParameter("telephone");
			try {
				Compte compte = this.service.create(email, motDePasse, nom, prenom, telephone);
				this.service.save(compte);
			} catch (javax.persistence.PersistenceException e) {
				Throwable t = Utils.unwrapThrowable(e);
				if (Utils.isReferentialIntegrityConstraint(t)) {
					System.out.println("Le compte '" + email + "' est déjà dans la bdd.");
				} else {
					throw e;
				}
			}
			request.setAttribute("success", Boolean.TRUE);
			request.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
		}
	}

}
