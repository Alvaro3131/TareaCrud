$(document).ready(function(){
	
});

$("#boton").click(function(){
	$.get("rc?opc=1", function(data, status){
		$("#respuesta").html(data);
	});
});