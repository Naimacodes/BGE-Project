package fr.bge.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.model.Compte;
import fr.bge.service.CompteService;

/**
 * Servlet implementation class CompteVoir
 */
@WebServlet(description = "La servlet qui m'affiche la liste des états du matériel", 
urlPatterns = { "/CompteVoir" })
public class CompteVoir extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
    
	private CompteService service = CompteService.getInstance();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompteVoir() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Long id;
		try {
			id = ServletUtils.getId(request);
		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		// 1 - il faut aller dans la bdd chercher l'email qui correspond à l'id
		// 2 - il faudra passer la liste dans les attributs
		Compte compte = this.service.get(id);
		request.setAttribute("e", compte);
		request.getRequestDispatcher("/jsp/compteVoir.jsp").forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
