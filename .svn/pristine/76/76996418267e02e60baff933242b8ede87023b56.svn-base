package fr.bge.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.facilities.Utils;
import fr.bge.model.TypeMateriel;
import fr.bge.service.TypeMaterielService;

/**
 * Servlet implementation class TypeMaterielLister
 */
@WebServlet(description = "La servlet qui va creer un nouveau type materiel", 
urlPatterns = { "/TypeMaterielCreer" })

public class TypeMaterielCreer extends CrclHttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private TypeMaterielService service = TypeMaterielService.getInstance();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TypeMaterielCreer() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	request.getRequestDispatcher("/jsp/typeMaterielCreer.jsp").forward(request, response);
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1 extraire les parametres http
		String label = request.getParameter("label");
		if (label == null || label.isEmpty()) {
			// ici je vais faire un truc aussi parce que ça ne va pas
			return;
		}
		BigDecimal montantCaution = null;
		try {
			montantCaution = Utils.getBigDecimal("montantCaution", request);
			System.out.println(montantCaution);
		} catch (ParseException e) {
			// Ici il faut faire quelque chose
			return;
		}
		// 2 on remplit l'entité, mais on va gérer ça on niveau du service
		TypeMateriel type = this.service.create(label, montantCaution);
		// 3 on sauve l'entité via le service
		this.service.save(type);
		response.sendRedirect("/crcl/TypeMaterielLister");
	}

}




