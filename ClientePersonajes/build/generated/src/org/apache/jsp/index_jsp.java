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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Index</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        th{\n");
      out.write("            color:blue;\n");
      out.write("        }\n");
      out.write("        #font{\n");
      out.write("            background-color: #4CAF50; border: none; color: white; padding: 15px 32px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                cursor: pointer;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    <body style=\"background-image: url(everis.jpg), url(everis.jpg);\">\n");
      out.write("\n");
      out.write("    ");

    try {
	wservice.PersonajesWS_Service service = new wservice.PersonajesWS_Service();
	wservice.PersonajesWS port = service.getPersonajesWSPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(request.getParameter("id"));
	java.lang.String nombre = request.getParameter("nombre");
	java.lang.String nacionalidad = request.getParameter("nacionalidad");
	java.lang.String empresa = request.getParameter("empresa");
	// TODO process result here
	java.lang.String result = port.ingresarPersonajes(id, nombre, nacionalidad, empresa);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <form action=\"index.jsp\" method=\"post\">\n");
      out.write("        <table style=\"border: 3px solid #73AD21\">\n");
      out.write("            <th>\n");
      out.write("            <tr>\n");
      out.write("                <th style=\"color: blue\">Id</th>\n");
      out.write("                <td><input type=\"text\" name=\"id\" size=\"10\" requerid/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th style=\"color: blue\">Nombre</th>\n");
      out.write("                <td><input type=\"text\" name=\"nombre\" size=\"40\" requerid/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th style=\"color: blue\">Nacionalidad</th>\n");
      out.write("                <td><input type=\"text\" name=\"nacionalidad\" size=\"40\" requerid/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th style=\"color: blue\">Empresa</th>\n");
      out.write("                <td><input type=\"text\" name=\"empresa\" size=\"40\" requerid/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"submit\" value=\"Agregar\" id=\"font\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            </th>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("    <br>\n");
      out.write("    <form action=\"actualizar.jsp\" method=\"post\">\n");
      out.write("        <table style=\"border: 3px solid #73AD21\">\n");
      out.write("            <tr>\n");
      out.write("                <th style=\"color: blue\">Id</th>\n");
      out.write("                <td><input type=\"text\" name=\"id\" size=\"10\" requerid/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Nombre</th>\n");
      out.write("                <td><input type=\"text\" name=\"nombre\" size=\"40\" requerid/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Nacionalidad</th>\n");
      out.write("                <td><input type=\"text\" name=\"nacionalidad\" size=\"40\" requerid/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Empresa</th>\n");
      out.write("                <td><input type=\"text\" name=\"empresa\" size=\"40\" requerid/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"submit\" value=\"Actualizar\" id=\"font\" /></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("    <br>\n");
      out.write("    <form action=\"buscar.jsp\" method=\"post\">\n");
      out.write("    <table style=\"border: 3px solid #73AD21\">\n");
      out.write("        <tr>\n");
      out.write("            <th>Id</th>\n");
      out.write("            <td><input type=\"text\" name=\"id\" required/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("                <td><input type=\"submit\" value=\"Buscar\" id=\"font\" /></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("        </form>\n");
      out.write("    <br>\n");
      out.write("    <form action=\"eliminar.jsp\" method=\"post\">\n");
      out.write("    <table style=\"border: 3px solid #73AD21;\">\n");
      out.write("        <tr>\n");
      out.write("            <th>Id</th>\n");
      out.write("            <td><input type=\"text\" name=\"id\" required/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("                <td><input type=\"submit\" value=\"Eliminar\" id=\"font\" /></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("        </form> \n");
      out.write("    </body>\n");
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
