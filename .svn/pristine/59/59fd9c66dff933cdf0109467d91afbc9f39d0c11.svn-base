package fr.bge.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.model.TypeSeance;

import fr.bge.service.TypeSeanceService;

/**
 * Servlet implementation class TypeSeanceLister
 */
@WebServlet(description = "La servlet qui m'affiche la liste des types de séance", 
urlPatterns = { "/TypeSeanceVoir" })
public class TypeSeanceVoir extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
	private final TypeSeanceService service = TypeSeanceService.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TypeSeanceVoir() {
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
		
		
		
		TypeSeance type = this.service.get(id);
		request.setAttribute("entity", type);
		// 1 - il faut aller dans la bdd chercher l'etat matériel qui correspond à l'id
		// 2 - il faudra passer la liste dans les attributs
		request.setAttribute("id", id);
		request.getRequestDispatcher("/jsp/typeSeanceVoir.jsp").forward(request, response);
	}

}
