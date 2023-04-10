<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Formulario de Registro de Docentes con Bootstrap</title>
	<!-- Agrega los enlaces a los archivos CSS de Bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/estilos.css">
</head>
<body>
	<div class="container">
		<img src="img/logo-white.svg" alt="Logo" class="logo">
		<h1>Registro </h1>
		
		<form name="frmRegistrar" method="get" action="svlAlumno" >
		
		
			<div class="form-group">
				<label for="nombre">Nombre:</label>
				<input type="text" class="form-control" name ="txtNombres" id="nombre" placeholder="Introduzca su nombre">
			</div>
			<div class="form-group">
				<label for="apellido">Apellido:</label>
				<input type="text" class="form-control" name ="txtApellido" id="apellido" placeholder="Introduzca su apellido">
			</div>
			<div class="form-group">
				<label for="correo">Correo electrónico:</label>
				<input type="email" class="form-control" name ="txtCorreo" id="correo" placeholder="Introduzca su correo electrónico">
			</div>
			<div class="form-group">
				<label for="contrasena">Contraseña:</label>
				<input type="password" class="form-control" name ="txtContra"  id="contrasena" placeholder="Introduzca su contraseña">
			</div>
			<button type="submit" class="btn btn-primary">Registrarse</button>
		</form>
	</div>
    
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>