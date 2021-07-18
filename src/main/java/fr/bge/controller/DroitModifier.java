package fr.bge.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.facilities.Utils;
import fr.bge.model.Droit;
import fr.bge.service.DroitService;

/**
 * Servlet implementation class DroitModifier
 */
@WebServlet("/DroitModifier")
public class DroitModifier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private final DroitService service = DroitService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DroitModifier() {
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
		Droit droit = this.service.findById(id);

		request.setAttribute("droit", droit);

		request.getRequestDispatcher("/jsp/droitModifier.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long id = Utils.getLong("droit", request);

		Droit droit = this.service.get(id);

		String label = request.getParameter("label");
		if (label != null && !label.isEmpty()) {
			droit.setLabel(label);
		}

		String description = request.getParameter("description");
		if (description != null && !description.isEmpty()) {
			droit.setDescription(description);
		}

		Boolean isActif = Utils.getBoolean("actif", request);

		if (isActif != null) {
			droit.setActif(isActif);
		}

		this.service.update(droit);

		System.out.println("Les params sont : " + description + " label :" + label + " actif : " + isActif);

		response.sendRedirect("/crcl/DroitLister");
	}

}
