package fr.bge.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.model.CompteRendu;
import fr.bge.service.CompteRenduService;

/**
 * Servlet implementation class CompteRenduLister
 */
@WebServlet(description = "La servlet qui m'affiche la liste des comptes rendus", urlPatterns = { "/CompteRenduLister" })
public class CompteRenduLister extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CompteRenduService service = CompteRenduService.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompteRenduLister() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<CompteRendu> list = this.service.select();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/jsp/compteRenduLister.jsp").forward(request, response);
	}

}




