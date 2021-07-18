package fr.bge.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.facilities.Utils;
import fr.bge.model.TypeSeance;
import fr.bge.service.TypeSeanceService;


/**
 * Servlet implementation class EtatMaterielLister
 */
@WebServlet(description = "La servlet qui va creer un nouveau etat materiel", 
urlPatterns = { "/TypeSeanceCreer" })
public class TypeSeanceCreer extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
	private final TypeSeanceService service = TypeSeanceService.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TypeSeanceCreer() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	request.getRequestDispatcher("/jsp/typeSeanceCreer.jsp").forward(request, response);
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

//1 extraire les parametres https
		String libelleCourt = request.getParameter("libelleCourt");
		if (libelleCourt == null || libelleCourt.isEmpty()) {
			// 1er problème :
			return;
		}
		String libelle = request.getParameter("libelle");
		if (libelle == null) {
			// 1er problème :
			return;
		}
		Boolean isActif = Utils.getBoolean("actif", request);
		String description = request.getParameter("description");
		
		
		// 2 on remplit l'entité, mais on va gérer ça on niveau du service
		
		// ctrl + shift + t - dateInit pour obtenir le try catch
		try {
			TypeSeance etat = this.service.create(libelle, isActif, description,libelleCourt);
			this.service.save(etat);
		} catch (javax.persistence.PersistenceException e) {
			Throwable t = Utils.unwrapThrowable(e);
			if (Utils.isReferentialIntegrityConstraint(t)) {
				System.out.println("Le type de séance '" + libelle + "' est déjà dans la bdd");
			} else {
				throw e;
			}
		}
		// 3 on sauve l'entité via le service
		response.sendRedirect("/crcl/TypeSeanceLister");
	}

}

