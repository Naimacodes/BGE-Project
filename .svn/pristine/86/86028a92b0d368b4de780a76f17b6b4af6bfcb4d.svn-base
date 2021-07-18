package fr.bge.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.service.EtatMaterielService;

/**
 * Servlet implementation class EtatMaterielLister
 */
@WebServlet(description = "La servlet qui m'affiche la liste des états du matériel", 
urlPatterns = { "/EtatMaterielSupprimer" })
public class EtatMaterielSupprimer extends CrclHttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private final EtatMaterielService service = EtatMaterielService.getInstance();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EtatMaterielSupprimer() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id;
		try {
			id = ServletUtils.getId(request);
		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		this.service.remove(id);
		response.sendRedirect("/crcl/EtatMaterielLister");
	}

}
