package fr.bge.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ModuleVoir
 */
@WebServlet("/ModuleVoir")
public class ModuleVoir extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModuleVoir() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long id;
		try {
			id = ServletUtils.getId(request);
		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}

		// 1 - il faut aller dans la bdd chercher le module qui correspond à l'id
		// 2 - il faudra passer la liste dans les attributs
		request.setAttribute("id", id);
		request.getRequestDispatcher("/jsp/moduleVoir.jsp").forward(request, response);
	}

}
