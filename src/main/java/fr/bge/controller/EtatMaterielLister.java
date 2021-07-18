package fr.bge.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.model.EtatMateriel;
import fr.bge.service.EtatMaterielService;

/**
 * Servlet implementation class EtatMaterielLister
 */
@WebServlet(description = "La servlet qui m'affiche la liste des états du matériel", urlPatterns = { "/EtatMaterielLister" })
public class EtatMaterielLister extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EtatMaterielService service = EtatMaterielService.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EtatMaterielLister() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<EtatMateriel> list = this.service.select();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/jsp/etatMaterielLister.jsp").forward(request, response);
	}

}




