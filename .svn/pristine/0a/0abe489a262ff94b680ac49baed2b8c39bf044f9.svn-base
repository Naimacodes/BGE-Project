package fr.bge.controller;

import java.io.IOException;
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
@WebServlet(description = "La servlet qui m'affiche la liste des états du matériel", 
urlPatterns = { "/EtatMaterielVoir" })
public class EtatMaterielVoir extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
    
	private EtatMaterielService service = EtatMaterielService.getInstance(); 
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EtatMaterielVoir() {
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
		// 1 - il faut aller dans la bdd chercher l'etat matériel qui correspond à l'id
		// 2 - il faudra passer la liste dans les attributs
		EtatMateriel etatMateriel = this.service.get(id);
		request.setAttribute("e", etatMateriel);
		request.getRequestDispatcher("/jsp/etatMaterielVoir.jsp").forward(request, response);
	}

}
