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
@WebServlet(description = "La servlet qui va creer un nouveau etat materiel", 
urlPatterns = { "/EtatMaterielCreer" })
public class EtatMaterielCreer extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;

	private final EtatMaterielService service = EtatMaterielService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EtatMaterielCreer() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/etatMaterielCreer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1 extraire les parametres https
		String label = request.getParameter("label");
		if (label == null || label.isEmpty()) {
			// TODO retourner vers la jsp et indiquer l'erreur à l'utilisateur : Label est mal renseigné
			System.out.println("Le label est mal renseigné");
			return;
		}
		// A priori j'ai quelque chose de correct, je vais créer mon entité
		// 2 on remplit l'entité, mais on va gérer ça on niveau du service
		if (this.service.exist(label)) {
			// TODO retourner vers la jsp et indiquer l'erreur à l'utilisateur : Label existe déjà
			System.out.println("Creation avec une valeur déjà utilisé dans une colonne Unique");
			return;
		}
		EtatMateriel etat = this.service.create(label);
		// 3 on sauve l'entité via le service
		this.service.save(etat);
		response.sendRedirect("/crcl/EtatMaterielLister");
	}

}
