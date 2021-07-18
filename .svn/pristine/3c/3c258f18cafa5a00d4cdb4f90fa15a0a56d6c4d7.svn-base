package fr.bge.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.facilities.Utils;
import fr.bge.model.Role;
import fr.bge.service.RoleService;

/**
 * Servlet implementation class RoleModifier
 */
@WebServlet("/RoleModifier")
public class RoleModifier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private final RoleService service = RoleService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RoleModifier() {
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
			id = Utils.getLong("id", request);
		} catch (NumberFormatException e) {
			return;
		}
		Role role = this.service.findById(id);

		request.setAttribute("role", role);

		request.getRequestDispatcher("/jsp/roleModifier.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long id = Utils.getLong("role", request);

		Role role = this.service.get(id);

		String label = request.getParameter("label");
		if (label != null && !label.isEmpty()) {
			role.setLabel(label);
		}

		String description = request.getParameter("description");
		if (description != null && !description.isEmpty()) {
			role.setDescription(description);
		}

		Boolean isActif = Utils.getBoolean("actif", request);

		if (isActif != null) {
			role.setActif(isActif);
		}

		this.service.update(role);

		System.out.println("Les params sont : " + description + " label :" + label + " actif : " + isActif);

		response.sendRedirect("/crcl/RoleLister");
	}

}
