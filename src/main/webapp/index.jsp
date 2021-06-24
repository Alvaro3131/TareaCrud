<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="recursos/css/bootstrap.min.css" />
<body>
<div class="container" style="margin-bottom: 40px">
	<div class="form-group">
		<label for="a">Rol</label>
		<input type="text" class="form-control" id="nomrol"/>
		<input type="hidden" class="form-control" id="opc" value="2"/>
	</div>
	<button class="btn btn-danger" id="boton2">Crear</button>
</div>
<div class="container">
	<button class="btn btn-primary" id="boton">ReaAll</button>
</div>
<div class="container" id="respuesta">
	
</div>
<script src="recursos/js/jquery.js"></script>
<script src="recursos/js/bootstrap.min.js"></script>
<script type="text/javascript" src="recursos/js/rol.js"></script>
</body>
</html>