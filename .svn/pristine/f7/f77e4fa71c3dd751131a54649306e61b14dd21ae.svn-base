package fr.bge.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.model.Droit;
import fr.bge.service.DroitService;

/**
 * Servlet implementation class DroitLister
 */
@WebServlet(description = "La servlet affiche une page pour créer un droit.", urlPatterns = { "/DroitSupprimer" })
public class DroitSupprimer extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
	private DroitService service = DroitService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DroitSupprimer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long id;
		Long idSupprime;
		try {

			id = ServletUtils.getId(request);
			System.out.println("Coucou je suis dans le try de DroitSupprimer" + id);

			Droit droit = service.remove(id);
			idSupprime = droit.getDroit();

		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		/* request.setAttribute("id", idSupprime); */
		response.sendRedirect("/crcl/DroitLister");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

}
