package fr.bge.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.model.Formation;
import fr.bge.service.FormationService;

/**
 * Servlet implementation class EtatMaterielLister
 */
@WebServlet(description = "La servlet qui m'affiche la liste des formations", urlPatterns = { "/FormationLister" })
public class FormationLister extends CrclHttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private FormationService service = FormationService.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormationLister() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Formation> list = this.service.select();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/jsp/formationLister.jsp").forward(request, response);
	}

}




