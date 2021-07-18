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
 * Servlet implementation class ModuleCreer
 */
@WebServlet("/ModuleCreer")
public class ModuleCreer extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;

	private final ModuleService service = ModuleService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModuleCreer() {
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
		request.getRequestDispatcher("/jsp/moduleCreer.jsp").forward(request, response);
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
			return;
		}
		// 2 on remplit l'entité, mais on va gérer ça on niveau du service
		if (this.service.exist(label)) {
			System.out.println("Le module '" + label + "' est déjà dans la bdd");
			// Il faut retourner dans la jsp creer en donnant le module qui a été créer par le service.create(...)
			// préremplir le champ label
			return;
		}
		Module module = this.service.create(label);
		// 3 on sauve l'entité via le service
		this.service.save(module);
		response.sendRedirect("/crcl/ModuleLister");
		
	}
}
