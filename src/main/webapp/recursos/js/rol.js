$(document).ready(function(){
	listar();
limpiar();
	
});

function listar(){
	$.get("rc", {"opc":1}, function(data){
		var x= JSON.parse(data);
		$("#tablita tbody tr").remove();
		for(var i=0;i<x.length;i++){
			$("#tablita").append("<tr><td>"+(i+1)+"</td><td>"+x[i].idproducto+"</td><td>"+x[i].nombre+"</td><td>"+x[i].precio+"</td><td>"+x[i].cantidad+"</td><td><a href='#' onclick='editar("+x[i].idproducto+")'><i class='far fa-edit'></i></a></td><td><a href='#' onclick='eliminar("+x[i].idproducto+")'><i class='fas fa-trash-alt'></i></a></td></tr>");
		}
	});
}
//registrar y editar rol
$("#boton2").click(function(){
	var idr = $("#id").val();
	
	if(idr==0){
	var param = {"nombre":$("#nombre").val(),"precio":$("#precio").val(),"cantidad":$("#cantidad").val(), "opc":2};
	$.ajax({
		beforeSend: function(){
			$('#resultado').html('Esperando...!');
		},
		data: param,
		url: 'rc',
		type: 'POST',
		success: function(response){
			alert(response);
			limpiar();
			listar();
		},
		error: function(jqXHR, estado, error){
		console.log(estado)
		console.log(error)
		},
		complete: function (jqXHR, estado){
			console.log(estado)
		}				
	});
	}else{
		alert($("#id").val()+"/"+$("#nombre").val());
		$.post("rc",{"id":$("#id").val(),"nombre":$("#nombre").val(),"precio":$("#precio").val(),"cantidad":$("#cantidad").val(),"opc":4},function (data) {
		listar();
		limpiar();	
    });
	}
});

function editar(id){
alert(id);
	$("#boton2").html("Editar");
	$.get("rc",{"id":id,"opc":3},function (data) {
		var x = JSON.parse(data);
        $("#nombre").val(x.nombre)
        $("#precio").val(x.precio)
        $("#cantidad").val(x.cantidad)
        $("#id").val(x.idproducto);
    });
}
function eliminar(id){
	$.get("rc",{"id":id,"opc":5},function () {
        listar();
    });
}
function limpiar(){
	$("#nombre").val("");
	$("#precio").val("");
	$("#cantidad").val("");
	$("#id").val(0);
	$("#nombre").focus();
	$("#id").val(0);
	$("#boton2").html("Crear");
}
