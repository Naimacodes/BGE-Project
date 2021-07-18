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
@WebServlet("/RoleVoir")
public class RoleVoir extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RoleVoir() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long id;
		try {
			id = ServletUtils.getId(request);

		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		Role role = RoleService.getInstance().get(id);

		if (role == null) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		} else {
			request.setAttribute("role", role);
			request.getRequestDispatcher("/jsp/roleVoir.jsp").forward(request, response);
		}

	}
}
