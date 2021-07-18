package fr.bge.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TypeMaterielVoir
 */
@WebServlet("/TypeMaterielVoir")
public class TypeMaterielVoir extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TypeMaterielVoir() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = ServletUtils.getId(request);
		request.setAttribute("id",id);
		request.getRequestDispatcher("/jsp/typeMaterielVoir.jsp").forward(request,  response);	
	}

	
}


