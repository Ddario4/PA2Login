<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Formulario de Registro de Docentes con Bootstrap</title>
	<!-- Agrega los enlaces a los archivos CSS de Bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<style>
		body {
			background-color: #f8f9fa;
		}
		.container {
			display: flex;
			flex-direction: column;
			align-items: center;
			justify-content: center;
			height: 100vh;
		}
		form {
			width: 100%;
			max-width: 400px;
			padding: 20px;
			background-color: #fff;
			border-radius: 5px;
			box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
		}
		form label {
			font-weight: bold;
		}
		form input[type=text], input[type=email], input[type=password] {
			background-color: #f8f9fa;
			border: none;
			border-radius: 3px;
			color: #000;
			padding: 10px;
			margin-bottom: 20px;
			width: 100%;
		}
		form input[type=text]:focus, input[type=email]:focus, input[type=password]:focus {
			background-color: #fff;
			outline: none;
		}
		form button {
			background-color: #007bff;
			border: none;
			border-radius: 3px;
			color: #fff;
			padding: 10px;
			margin-top: 20px;
			width: 100%;
		}
		form button:hover {
			background-color: #0069d9;
			color: #fff;
		}
		h1 {
			color: #000000;
			font-weight: bold;
			margin-bottom: 30px;
		}
		.logo {
			width: 150px;
			height: 150px;
			margin-bottom: 30px;
		}
	</style>
</head>
<body>
	<div class="container">
		<img src="img/logo-white.svg" alt="Logo" class="logo">
		<h1>Registro </h1>
		<form>
			<div class="form-group">
				<label for="nombre">Nombre:</label>
				<input type="text" class="form-control" id="nombre" placeholder="Introduzca su nombre">
			</div>
			<div class="form-group">
				<label for="apellido">Apellido:</label>
				<input type="text" class="form-control" id="apellido" placeholder="Introduzca su apellido">
			</div>
			<div class="form-group">
				<label for="correo">Correo electrónico:</label>
				<input type="email" class="form-control" id="correo" placeholder="Introduzca su correo electrónico">
			</div>
			<div class="form-group">
				<label for="contrasena">Contraseña:</label>
				<input type="password" class="form-control" id="contrasena" placeholder="Introduzca su contraseña">
			</div>
			<button type="submit" class="btn btn-primary">Registrarse</button>
		</form>
	</div>
    
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>