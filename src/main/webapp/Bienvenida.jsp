<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
    int id = (int) session.getAttribute("id");
String ide=String.valueOf(id);
%>   
    
    
    
    
    
<!DOCTYPE html>
<html>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
    	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/estilos.css">
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body >
<div class="alert alert-primary" role="alert">
  <h1>  BIENVENIDO </h1>
</div>
<h2> </h2>
<div class="container">
<form name="frmRegistrar" method="get" action="svlPassword" >
		
		
		
			<div class="form-group">
				<label for="contrasena"> Escriba Contraseña Anterior </label>
				<input type="password" class="form-control" name ="txtantiguacontra"  id="contrasena" placeholder="Introduzca contraseña anterior">
			</div>
			<div class="form-group">
				<label for="contrasena"> Escriba la Nueva Contraseña </label>
				<input type="password" class="form-control" name ="txtNuevaContra"  id="contrasena" placeholder="Introduzca su nueva  contraseña">
			</div>
			
			<div class="form-group">
				<input type="text"  class="form-control" name ="txtId"  style="display:none" id="idalumno" placeholder="Introduzca su nueva  contraseña" value="<%= ide %> ">
			</div>
			<button type="submit" class="btn btn-primary">Cambiar Contraseña</button>
		</form>

</div>
</body>
</html>