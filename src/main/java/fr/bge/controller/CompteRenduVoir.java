package fr.bge.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CompteRenduVoir
 */
@WebServlet("/CompteRenduVoir")
public class CompteRenduVoir extends CrclHttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompteRenduVoir() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Long id = null;
		try {
			 id = ServletUtils.getId(request);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		request.setAttribute("id", id);
		request.getRequestDispatcher("jsp/compteRenduVoir.jsp").forward(request, response);;
		
	}
	
	

	
}
