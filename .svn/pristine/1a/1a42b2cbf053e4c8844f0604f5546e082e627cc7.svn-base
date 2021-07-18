package fr.bge.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.facilities.Utils;
import fr.bge.model.Module;
import fr.bge.service.ModuleService;

/**
 * Servlet implementation class ModuleModifier
 */
@WebServlet("/ModuleModifier")
public class ModuleModifier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private final ModuleService service = ModuleService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModuleModifier() {
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
		Module module = this.service.get(id);
		request.setAttribute("e", module);
		request.getRequestDispatcher("/jsp/moduleModifier.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long id;
		try {
			id = ServletUtils.getId(request);
		} catch (NumberFormatException e) {
			// TODO Gérer le cas de la bad request
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		// 1 extraire les parametres https
		String label = request.getParameter("label");
		if (label == null || label.isEmpty()) {
			// TODO retourner vers la jsp et indiquer l'erreur à l'utilisateur : Label est
			// mal renseigné
			System.out.println("Le label est mal renseigné");
			return;
		}
		// A priori j'ai quelque chose de correct, je vais créer mon entité
		// 2 on remplit l'entité, mais on va gérer ça on niveau du service
		Module module = this.service.merge(id, label);
		// 3 on sauve l'entité via le service
		try {
			this.service.update(module);
		} catch (Throwable e) {
			Throwable t = Utils.unwrapThrowable(e);
			if (Utils.isReferentialIntegrityConstraint(t)) {
				// TODO retourner vers la jsp et indiquer l'erreur à l'utilisateur : Label
				// existe déjà
				System.out.println("Update avec une valeur déjà utilisé dans une colonne Unique");
				return;
			}
		}
		response.sendRedirect("/crcl/ModuleLister");
	}
}