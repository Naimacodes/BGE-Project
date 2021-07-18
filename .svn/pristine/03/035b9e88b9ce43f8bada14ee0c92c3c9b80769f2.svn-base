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
 * Servlet implementation class DroitLister
 */
@WebServlet(description = "La servlet affiche une page pour créer un role.", urlPatterns = { "/RoleCreer" })
public class RoleCreer extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;

	private final RoleService service = RoleService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RoleCreer() {
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
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/jsp/roleCreer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1 extraire les parametres https
		String label = request.getParameter("label");
		if (label == null || label.isEmpty()) {
			// 1er problème :
			return;
		}
		Boolean isActif = Utils.getBoolean("actif", request);
		String description = request.getParameter("description");

		// 2 on remplit l'entité, mais on va gérer ça on niveau du service

		// ctrl + shift + t - dateInit pour obtenir le try catch
		try {
			Role role = this.service.create(label, isActif, description);
			this.service.save(role);
		} catch (javax.persistence.PersistenceException e) {
			Throwable t = Utils.unwrapThrowable(e);
			if (Utils.isReferentialIntegrityConstraint(t)) {
				System.out.println("Le role '" + label + "' est déjà dans la bdd.");
			} else {
				throw e;
			}
		}
		// 3 on sauve l'entité via le service
		response.sendRedirect("/crcl/RoleLister");
	}

}
