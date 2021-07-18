package fr.bge.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.model.ModeFormation;
import fr.bge.service.ModeFormationService;

/**
 * Servlet implementation class ModeFormationLister
 */
@WebServlet("/ModeFormationLister")
public class ModeFormationLister extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;

	private ModeFormationService service = ModeFormationService.getInstance();

	public ModeFormationLister() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ModeFormation> list = this.service.select();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/jsp/modeFormationLister.jsp").forward(request, response);
	}


}
