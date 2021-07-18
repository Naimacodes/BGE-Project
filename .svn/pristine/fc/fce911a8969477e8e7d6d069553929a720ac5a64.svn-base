package fr.bge.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.facilities.Utils;
import fr.bge.model.ModeFormation;
import fr.bge.service.ModeFormationService;

/**
 * Servlet implementation class ModeFormationModifier
 */
@WebServlet("/ModeFormationModifier")
public class ModeFormationModifier extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final ModeFormationService service = ModeFormationService.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModeFormationModifier() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id;
		try {
			id = ServletUtils.getId(request);
		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		ModeFormation etat = this.service.get(id);
		request.setAttribute("entity", etat);
		request.getRequestDispatcher("/jsp/modeFormationModifier.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id;
		try {
			id = ServletUtils.getId(request);
		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		String label = request.getParameter("label");
		if (label == null || label.isEmpty()) {
			System.out.println("Le label est mal renseigné");
			return;
		}
		String labelCourt = request.getParameter("labelCourt");
		if (labelCourt == null || labelCourt.isEmpty()) {
			System.out.println("Le labelCourt est mal renseigné");
			return;
		}
		String description = request.getParameter("description");
		if (description == null || description.isEmpty()) {
			System.out.println("La description est mal renseigné");
			return;
		}
		Boolean actif = Utils.getBoolean("actif", request);
		ModeFormation etat = this.service.merge(id, label, labelCourt, description, actif);
		this.service.update(etat);
		response.sendRedirect("/crcl/ModeFormationLister");
	}

}
