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
 * Servlet implementation class EtatMaterielLister
 */
@WebServlet(description = "La servlet qui va creer un nouveau etat materiel", 
urlPatterns = { "/ModeFormationCreer" })
public class ModeFormationCreer extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;

	private final ModeFormationService service = ModeFormationService.getInstance();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModeFormationCreer() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/modeFormationCreer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String label = request.getParameter("label");
		if (label == null || label.isEmpty()) {
			System.out.println("Le label est mal renseigné");
			return;
		}
		String description = request.getParameter("description");
		if (description == null || description.isEmpty()) {
			System.out.println("La description est mal renseigné");
			return;
		}
		String labelCourt = request.getParameter("labelCourt");
		if (labelCourt == null || labelCourt.isEmpty()) {
			System.out.println("Le labelCourt est mal renseigné");
			return;
		}
		Boolean isActif = Utils.getBoolean("actif", request);		
		try {
			ModeFormation etat = this.service.create(label, isActif, description, labelCourt);
			this.service.save(etat);
		} catch (javax.persistence.PersistenceException e) {
			Throwable t = Utils.unwrapThrowable(e);
			if (Utils.isReferentialIntegrityConstraint(t)) {
				System.out.println("Le mode de formation '" + label + "' est déjà dans la bdd");
			} else {
				throw e;
			}
		}
		response.sendRedirect("/crcl/ModeFormationLister");
	}

}
