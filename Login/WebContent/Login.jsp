<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <script src="WEB-INF/Valida.js"></script>
</head>
<body>

<form name="Fvalida" method="post" action="login">
<p style="color: #3910a0">Name:</p>
<input type="text" name="name" size="20" style="background-color: #ffdd05"><br>
<p style="color: #3910a0">Password:</p>
<input type="password" name="pass" size="20" style="background-color: #ffdd05"><br>
<input style="color: #09a1f9; background-color: lightblue;" type="submit" value="Enviar" onClick="validarF()">
</form>
<script>
function validarF(){ 
   	
   	if (document.Fvalida.name.value.length==0){ 
      	alert("Escribre tu nombre") 
      	document.Fvalida.name.focus() 
      	return 0; 
   	} 
   	if (document.Fvalida.pass.value.length==0){ 
      	alert("Introduce un password") 
      	document.Fvalida.pass.focus() 
      	return 0; 
   	} 
}
</script>
</body>
</html>