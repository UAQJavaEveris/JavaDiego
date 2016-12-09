<%-- 
    Document   : index
    Created on : 08-dic-2016, 14:02:33
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    
    <style>
        th{
            color:blue;
        }
        #font{
            background-color: #4CAF50; border: none; color: white; padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                cursor: pointer;
        }
        
    </style>
    <body style="background-image: url(everis.jpg), url(everis.jpg);">

    <%
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
    %>


    <form action="index.jsp" method="post">
        <table style="border: 3px solid #73AD21">
            <th>
            <tr>
                <th style="color: blue">Id</th>
                <td><input type="text" name="id" size="10" requerid/></td>
            </tr>
            <tr>
                <th style="color: blue">Nombre</th>
                <td><input type="text" name="nombre" size="40" requerid/></td>
            </tr>
            <tr>
                <th style="color: blue">Nacionalidad</th>
                <td><input type="text" name="nacionalidad" size="40" requerid/></td>
            </tr>
            <tr>
                <th style="color: blue">Empresa</th>
                <td><input type="text" name="empresa" size="40" requerid/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Agregar" id="font" /></td>
            </tr>
            </th>
        </table>
    </form>
    <br>
    <form action="actualizar.jsp" method="post">
        <table style="border: 3px solid #73AD21">
            <tr>
                <th style="color: blue">Id</th>
                <td><input type="text" name="id" size="10" requerid/></td>
            </tr>
            <tr>
                <th>Nombre</th>
                <td><input type="text" name="nombre" size="40" requerid/></td>
            </tr>
            <tr>
                <th>Nacionalidad</th>
                <td><input type="text" name="nacionalidad" size="40" requerid/></td>
            </tr>
            <tr>
                <th>Empresa</th>
                <td><input type="text" name="empresa" size="40" requerid/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Actualizar" id="font" /></td>
            </tr>
        </table>
    </form>
    <br>
    <form action="buscar.jsp" method="post">
    <table style="border: 3px solid #73AD21">
        <tr>
            <th>Id</th>
            <td><input type="text" name="id" required/></td>
        </tr>
        <tr>
                <td><input type="submit" value="Buscar" id="font" /></td>
        </tr>
    </table>
        </form>
    <br>
    <form action="eliminar.jsp" method="post">
    <table style="border: 3px solid #73AD21;">
        <tr>
            <th>Id</th>
            <td><input type="text" name="id" required/></td>
        </tr>
        <tr>
                <td><input type="submit" value="Eliminar" id="font" /></td>
        </tr>
    </table>
        </form> 
    </body>
</html>
