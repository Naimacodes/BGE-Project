package fr.bge.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.model.Droit;
import fr.bge.service.DroitService;

/**
 * Servlet implementation class DroitLister
 */
@WebServlet(description = "La servlet qui m'affiche la liste des droits.", urlPatterns = { "/DroitLister" })
public class DroitLister extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
	private DroitService service = DroitService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DroitLister() {
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

		List<Droit> list = this.service.select();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/jsp/droitLister.jsp").forward(request, response);
		System.out.println();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
}
