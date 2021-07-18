package fr.bge.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.model.Compte;
import fr.bge.service.CompteService;

/**
 * Servlet implementation class CompteLister
 */
@WebServlet(description = "La servlet qui m'affiche la liste des comptes", urlPatterns = { "/CompteLister" })
public class CompteLister extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
	private CompteService service = CompteService.getInstance();  
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CompteLister() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		List<Compte> list = this.service.select();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/jsp/compteLister.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}

