package fr.bge.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.bge.model.Role;
import fr.bge.service.RoleService;

/**
 * Servlet implementation class RoleLister
 */
@WebServlet("/RoleLister")
public class RoleLister extends CrclHttpServlet {
  private static final long serialVersionUID = 1L;
  private RoleService service = RoleService.getInstance();

  /**
   * @see HttpServlet#HttpServlet()
   */
  public RoleLister() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    List<Role> list = this.service.select();
    request.setAttribute("list", list);
    request.getRequestDispatcher("/jsp/roleLister.jsp").forward(request, response);
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */


}
