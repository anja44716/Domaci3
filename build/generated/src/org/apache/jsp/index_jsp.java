package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("        <style>\n");
      out.write("            table, th, td {\n");
      out.write("            border: 1px solid black;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("            th, td {\n");
      out.write("            padding: 5px;\n");
      out.write("            text-align: left;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <h2>OSNOVNI PODACI O POSLOVNOM PARTNERU: </h2>\n");
      out.write("\n");
      out.write("<table style=\"width:80%\">\n");
      out.write("  <tr>\n");
      out.write("    <td>Ime</td>\n");
      out.write("    <td><input type=\"text\" name=\"ime\" value=\"\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Adresa</td>\n");
      out.write("    <td><input type=\"text\" name=\"adresa\" value=\"\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>E-mail</td>\n");
      out.write("    <td><input type=\"text\" name=\"email\" value=\"\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Telefon</td>\n");
      out.write("    <td><input type=\"text\" name=\"telefon\" value=\"\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Zanimanje</td>\n");
      out.write("    <td><input type=\"checkList\" name=\"zanimanje\" value=\"\"></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("    <h3> Predznanje Jave </h3>\n");
      out.write("    <h4> <input type=\"radio\" name=\"radio\" value=\"nema\"> Nema \n");
      out.write("    <input type=\"radio\" name=\"radio\" value=\"malo\">Malo \n");
      out.write("    <input type=\"radio\" name=\"radio\" value=\"srednje\">Srednje\n");
      out.write("    <input type=\"radio\" name=\"radio\" value=\"visoko\">Visoko</h4>\n");
      out.write("    <h4> Napomena </43>\n");
      out.write("        <h4> <textarea name=\"adresa\" rows=\"4\"></textarea> </h4>\n");
      out.write("    <h4> <input type=\"checkBox\" name=\"cuvanje\" value=\"cuvanje\"> Da li zelite da budete sacuvani u bazi? </h4>\n");
      out.write("    <input type=\"submit\" value=\"Obradi partnera\">\n");
      out.write("    <input type=\"reset\" value=\"Obrisi formu\">\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
