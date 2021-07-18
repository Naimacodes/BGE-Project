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
@WebServlet(description = "La servlet qui m'affiche un droit.", urlPatterns = {"/DroitVoir"})
public class DroitVoir extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public DroitVoir() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    Long id;
    try {
      id = ServletUtils.getId(request);
      // 1 - il faut aller dans la bdd chercher le droit qui correspond à l'id
      // 2 - il faudra passer la liste dans les attributs

    } catch (NumberFormatException e) {
      response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
      return;
    }
    Droit droit = DroitService.getInstance().get(id);

    if (droit == null) {
      response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    } else {
      request.setAttribute("droit", droit);
      request.getRequestDispatcher("/jsp/droitVoir.jsp").forward(request, response);
    }
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */


}
