<%-- 
    Document   : buscar.jsp
    Created on : 08-dic-2016, 16:45:32
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar</title>
    </head>
    <body style="background-image: url(everis.jpg), url(everis.jpg);">
        
    <%
    try {
	wservice.PersonajesWS_Service service = new wservice.PersonajesWS_Service();
	wservice.PersonajesWS port = service.getPersonajesWSPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(request.getParameter("id"));
	// TODO process result here
	java.lang.String result = port.buscarPersonajes(id);
	out.println("<p style=color:#f4e111; font-size: 150%;>"+result+"</p>");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    out.println("No se ingreso nada");
    }
    %>
    
    </body>
</html>
