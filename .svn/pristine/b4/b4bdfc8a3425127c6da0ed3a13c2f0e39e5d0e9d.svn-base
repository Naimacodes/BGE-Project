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
 * Servlet implementation class TypeMaterielModifier
 */
@WebServlet("/TypeMaterielModifier")
public class TypeMaterielModifier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private final TypeMaterielService service = TypeMaterielService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TypeMaterielModifier() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id;
		try {
			id = ServletUtils.getId(request);
		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		TypeMateriel etat = this.service.get(id);
		request.setAttribute("entity", etat);
		request.getRequestDispatcher("/jsp/typeMaterielModifier.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id;
		try {
			id = ServletUtils.getId(request);
		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		String label = request.getParameter("label");
		if (label == null || label.isEmpty()) {
			System.out.println("Le label est mal renseigné");
			return;
		}
		
		BigDecimal montantCaution = null;
		try {
			montantCaution = Utils.getBigDecimal("montantCaution", request);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TypeMateriel etat = this.service.merge(id, label, montantCaution);
		this.service.update(etat);
		response.sendRedirect("/crcl/TypeMaterielLister");
	}

}
