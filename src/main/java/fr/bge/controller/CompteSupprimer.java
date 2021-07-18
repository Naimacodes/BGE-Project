package fr.bge.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CompteSupprimer
 */
@WebServlet("/CompteSupprimer")
public class CompteSupprimer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompteSupprimer() {
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
	      // 1 - il faut aller dans la bdd chercher le role qui correspond à l'id
	      // 2 - il faudra passer la liste dans les attributs

	    } catch (NumberFormatException e) {
	      response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	      return;
	    }

	    request.setAttribute("id", id);
	    request.getRequestDispatcher("/jsp/compteSupprimer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
}
