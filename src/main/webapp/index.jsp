<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="recursos/faw/web-fonts-with-css/css/fontawesome-all.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="recursos/css/bootstrap.min.css" />
<link rel="stylesheet" href="recursos/css/rol.css" />
<body>
	<div class="container small" style="margin-bottom: 40px">
		<div class="form-group">
			<label for="a">Rol</label> 
			<input type="text" class="form-control"	id="nomrol" /> 
			<input type="hidden" class="form-control"	id="id" value="0" />
		</div>
		<button class="btn btn-danger" id="boton2">Crear</button>
	</div>
	<div class="container small">
		<table class="table" id="tablita">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">ID</th>
					<th scope="col">Rol</th>
					<th scope="col" colspan="2">Acción</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>
	</div>
	<script src="recursos/js/jquery.js"></script>
	<script src="recursos/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="recursos/js/rol.js"></script>
</body>
</html>