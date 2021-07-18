package fr.bge.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.model.Module;
import fr.bge.service.ModuleService;

/**
 * Servlet implementation class ModuleLister
 */
@WebServlet("/ModuleLister")
public class ModuleLister extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;

	private ModuleService service = ModuleService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModuleLister() {
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
		List<Module> list = this.service.select();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/jsp/moduleLister.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

}
