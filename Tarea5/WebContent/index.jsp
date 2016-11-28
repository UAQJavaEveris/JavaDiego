<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nacionalidad</title>
</head>
<body>

<form method="post" action="Country">
<p style="color: #ffffff">Nombre:</p>
<input type="text" name="name" size="20" style="background-color: #ffdd05"><br>
<p style="color: #3910a0">Nacionalidad:</p>
<select name="country" style="color: #ffffff;background-color: #ffdd05">
  <option>Mexico</option>
  <option>Estados Unidos</option>
  <option>España</option>
  <option>Holanda</option>
</select><br><br>
<input style="color: #09a1f9; background-color: lightblue;" type="submit" value="Enviar">
</form>


</body>
</html>