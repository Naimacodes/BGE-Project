package fr.bge.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bge.model.ModeFormation;
import fr.bge.service.ModeFormationService;

/**
 * Servlet implementation class ModeFormationLister
 */
@WebServlet("/ModeFormationVoir")
public class ModeFormationVoir extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final ModeFormationService service = ModeFormationService.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModeFormationVoir() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Long id;
		try {
			id = ServletUtils.getId(request);
		} catch (NumberFormatException e) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		ModeFormation etat = this.service.get(id);
		request.setAttribute("entity", etat);
		request.setAttribute("id", id);
		request.getRequestDispatcher("/jsp/modeFormationVoir.jsp").forward(request, response);
	}

	
}
