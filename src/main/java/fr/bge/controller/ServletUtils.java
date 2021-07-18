package fr.bge.controller;

import javax.servlet.http.HttpServletRequest;

public class ServletUtils {

  /**
   * Récupère le paramètre id de la requete et le parse en Long.<br>
   * La méthode lève une NumberFormatException si le paramètre http id n'est pas un long
   * 
   * @param request la requete http
   * @return l'identifiant sous forme de Long
   */
  public static Long getId(HttpServletRequest request) {
    String str = request.getParameter("id");
    return Long.valueOf(str);
  }

  /**
   * Récupère le paramètre param de la requete.<br>
   *
   * @param param le nom du paramètre dans la requête http
   * @param request la requete http
   * @return l'identifiant sous forme de Long
   */
  public static String getString(String param, HttpServletRequest request) {
    String str = request.getParameter(param);
    return str;
  }
}
