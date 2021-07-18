package fr.bge.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.model.Role;
import fr.bge.service.RoleService;

/**
 * Servlet implementation class RoleLister
 */
@WebServlet("/RoleSupprimer")
public class RoleSupprimer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RoleService service = RoleService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RoleSupprimer() {
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
		Long id;
		/* Long idSupprime; */
		try {

			id = ServletUtils.getId(request);

			Role role = service.remove(id);
			// TODO Afficher une confirmation que le role a été supprimé.
			/* idSupprime = role.getRole(); */

		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		/* request.setAttribute("id", idSupprime); */
		response.sendRedirect("RoleLister");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

}
