package fr.bge.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.model.TypeMateriel;
import fr.bge.service.TypeMaterielService;

/**
 * Servlet implementation class TypeMaterielLister
 */
@WebServlet("/TypeMaterielLister")
public class TypeMaterielLister extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
	private TypeMaterielService service = TypeMaterielService.getInstance();
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TypeMaterielLister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<TypeMateriel> list = this.service.select();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/jsp/typeMaterielLister.jsp").forward(request, response);
	}


	

}
