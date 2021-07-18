package fr.bge.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.bge.model.Adresse;
import fr.bge.service.AdresseService;


/**
 * Servlet implementation class AdresseLister
 */
@WebServlet(description = "La servlet qui m'affiche la liste des Adresses", 
urlPatterns = { "/AdresseLister" })
public class AdresseLister extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AdresseService service = AdresseService.getInstance();
       
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdresseLister() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1 - il faut aller dans la bdd chercher la liste des mes objets
		// 2 - il faudra passer la liste dans les attributs
	
		List<Adresse> list = this.service.select();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/jsp/adresseLister.jsp").forward(request, response);

	}

}




