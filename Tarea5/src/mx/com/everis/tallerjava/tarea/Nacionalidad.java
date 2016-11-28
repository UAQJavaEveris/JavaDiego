package mx.com.everis.tallerjava.tarea;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Country")
public class Nacionalidad extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         PrintWriter out = response.getWriter();

         out.println("<html>");
         out.println("<head></head>");         
         out.println("<body>");

         out.println("Nombre : ");
         String nombre = request.getParameter("name");
         out.println(nombre);
         out.println("<br>");
         out.println("Nacionalidad : ");         
         String pais = request.getParameter("country");
         out.println(pais);
         
         out.println("</body>");
         out.println("</html>");           
    }

}