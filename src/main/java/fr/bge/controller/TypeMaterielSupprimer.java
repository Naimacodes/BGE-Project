package fr.bge.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.facilities.Utils;
import fr.bge.service.TypeMaterielService;

/**
 * Servlet implementation class TypeMaterielSupprimer
 */
@WebServlet("/TypeMaterielSupprimer")
public class TypeMaterielSupprimer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final TypeMaterielService service = TypeMaterielService.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TypeMaterielSupprimer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id;
		try {
			id = Utils.getLong("id", request);
		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		this.service.remove(id);
		response.sendRedirect("/crcl/TypeMaterielLister");
	}
}

