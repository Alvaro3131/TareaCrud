<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="recursos/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<style>
      *{
          margin-top: 5px;
      }
      .a{
          height: 70px;
          border: 1px solid rgb(156, 156, 156);
          border-right: none;
          
      }
      .a1{
          height: 70px;
          border: 1px solid rgb(156, 156, 156);
          border-left: none;
          text-align: end;
          
      }
      .b{
          height: 500px;
          border: 1px solid rgb(156, 156, 156);
          
      }
      .c{
        height: 50px;
        border: 1px solid rgb(156, 156, 156);
      }
      .h1{
          margin-top: 6px;
          font-size: 30px;
      }
    </style>
</head>

<body>
	<div class="container-fluid" style="width: 95%;">
        <div class="row">
            <div class="col-6 a">
                <div style="display: flex; flex-direction: initial;">
                      
                       <h1 class="h1">Tarea Crud</h1>
                   </div>
             </div>
             <div class="col-6 a1">
                <img src='imagenes/user.png' alt='' width='10%' style='border: 1px solid black; border-radius: 100%;'> 
               <div id="user" style="display: flex; flex-direction: initial; float: right;  "></div>
               
             </div>
            <div class="col-2 b">
                <nav class="navbar navbar-light " style="display: flex; flex-direction:inherit;">
                    <div style=" display: flex; flex-direction: initial;">
                     <i class="fas fa-home" style=" width: 10px; margin-right: 15px; margin-top: 15px;"></i>
                     <a class="navbar-brand color" href="#" style="color: rgb(0, 0, 0); font-size: 18px; " onclick="p()">
                       HOME
                     </a>
                   </div>
                   </nav>
                   
            </div>
            <div class="col-10" id="todo">
              <div class="container small" style="margin-bottom: 40px">
                <div class="form-group">
                  <h1>Crud Porducto</h1>
                 <div class="row">
                  <input type="text" class="form-control col-5"	id="nombre" style="margin-right: 20px;" placeholder="Nombre Producto" /> 
                 
                  <input type="text" class="form-control col-5"	id="precio" placeholder="Precio"/> 
                  
                </div>
                <br>
                <div class="row">
                  <input type="text" class="form-control col-5"	id="cantidad" style="margin-right: 20px;" placeholder="Cantidad"/> 

                  <input type="hidden" class="form-control col-7"	id="id" value="0" />
                  
                  <button class="btn btn-danger" id="boton2">Crear</button>
                </div>
                  
                
                </div>
               
              </div>
              <div class="container small">
                <table class="table" id="tablita">
                  <thead>
                    <tr>
                      <th scope="col">#</th>
                      <th scope="col">ID</th>
                      <th scope="col">Nombre</th>
                      <th scope="col">Precio</th>
                      <th scope="col">Cantidad</th>
            
                      <th scope="col" colspan="2">Acción</th>
                    </tr>
                  </thead>
                  <tbody>
            
                  </tbody>
                </table>
              </div>
            </div>
            <div class="col-12 c">
                
            </div>
        </div>
    </div>
	<script src="recursos/js/jquery.js"></script>
	<script src="recursos/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="recursos/js/rol.js"></script>
</body>
</html>