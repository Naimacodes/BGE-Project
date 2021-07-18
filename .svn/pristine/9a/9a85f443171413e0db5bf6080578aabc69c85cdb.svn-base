package fr.bge.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.facilities.Utils;
import fr.bge.model.Adresse;
import fr.bge.service.AdresseService;


/**
 * Servlet implementation class EtatMaterielLister
 */
@WebServlet(description = "La servlet qui va creer un nouveau etat materiel", 
urlPatterns = { "/AdresseCreer" })
public class AdresseCreer extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
	private final AdresseService service = AdresseService.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdresseCreer() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	request.getRequestDispatcher("/jsp/adresseCreer.jsp").forward(request, response);
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

//1 extraire les parametres https
		String libelle1 = request.getParameter("libelle1");
		if (libelle1 == null || libelle1.isEmpty()) {
			
			return;
		}
		String libelle2 = request.getParameter("libelle2");
		if (libelle2 == null) {
		
			return;
		}
		String codePostal = request.getParameter("codePostal");
		if (codePostal == null || codePostal.isEmpty()) {
			
			return;
		}
		String ville = request.getParameter("ville");
		if (ville == null) {
			
			return;
		}
		
		
		
		
		// 2 on remplit l'entité, mais on va gérer ça on niveau du service
		
		// ctrl + shift + t - dateInit pour obtenir le try catch
		try {
			 Adresse adresse = this.service.create(libelle1, libelle2, codePostal,ville);
			this.service.save(adresse);
		} catch (javax.persistence.PersistenceException e) {
			Throwable t = Utils.unwrapThrowable(e);
			if (Utils.isReferentialIntegrityConstraint(t)) {
				System.out.println("L'adresse '" + libelle1 + "' est déjà dans la bdd");
			} else {
				throw e;
			}
		}
		// 3 on sauve l'entité via le service
		response.sendRedirect("/crcl/AdresseLister");
	}

}

