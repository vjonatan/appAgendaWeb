<!doctype html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Insertar</title>
	
	<link rel="stylesheet" href="/appAgendaWeb/resources/css/cssLayout.css">
	<link rel="stylesheet" href="/appAgendaWeb/resources/css/cssComponente.css">
	<link rel="stylesheet" href="/appAgendaWeb/resources/css/jquery-ui.min.css">
	
	<script src="/appAgendaWeb/resources/js/jquery-2.1.3.min.js"></script>
	<script src="/appAgendaWeb/resources/js/jquery-ui.min.js"></script>
</head>
<body>
	<header>
		<nav class="menu">
			<ul>
				<li><a href="#">Inicio</a></li>
				<li><a href="#">Registrar datos en el sistema</a></li>
				<li><a href="#">Ver los datos registrados</a></li>
			</ul>
		</nav>
	</header>
	<section>
		<form id="frmInsertarUsuario" action="/appAgendaWeb/ServletUsuarioInsertar" method="post">
			<h2>Registrarme en el sistema</h2>
			<hr>
			<label for="txtNombre" class="label">Nombre:</label>
			<input type="text" id="txtNombre" name="txtNombre" class="text">
			<br>
			<label for="txtApellido" class="label">Apellido:</label>
			<input type="text" id="txtApellido" name="txtApellido" class="text">
			<br>
			<label for="dateFechaNac" class="label">Fecha Nacimiento:</label>
			<input type="date" id="dateFechaNac" name="dateFechaNac" class="text">
			<br>
			<label for="txtCorreoElectronico" class="label">Correo Electronico:</label>
			<input type="text" id="txtCorreoElectronico" name="txtCorreoElectronico" class="text">
			<br>
			<label for="passContrasenia" class="label">Contraseña:</label>
			<input type="password" id="passContrasenia" name="passContrasenia" class="password">
			<br>
			<input type="submit" value="Registrar Usuario" class="button">
		</form>
	</section>
</body>

</html>