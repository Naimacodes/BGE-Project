package fr.bge.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.bge.facilities.Utils;
import fr.bge.model.Compte;
import fr.bge.service.CompteService;

/**
 * Servlet implementation class Connexion
 */
@WebServlet("/Connexion")
public class Connexion extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;

	private CompteService service = CompteService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Connexion() {
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

		request.getSession();

		request.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email;
		String motDePasse;

		try {
			email = ServletUtils.getString("email", request);
			motDePasse = Utils.hashageSHA256(ServletUtils.getString("motDePasse", request));

			if (service.login(email, motDePasse)) {

				System.out.println("Connecté");
				Compte compte = service.findByEmail(email);
				compte.setMotDePasse("");
				HttpSession session = request.getSession();
				session.setAttribute("compte", compte);
				session.setAttribute("connecte", Boolean.TRUE);

				response.sendRedirect("Welcome");
			} else {

				System.out.println("Mauvais login.");
				response.sendRedirect("Connexion");
			}

		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
	}

}
