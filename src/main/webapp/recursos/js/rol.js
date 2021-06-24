$(document).ready(function(){
	
});

$("#boton").click(function(){
	$.get("rc?opc=1", function(data, status){
		$("#respuesta").html(data);
	});
});
$("#boton2").click(function(){
	var param = {"rol":$("#nomrol").val(), "opc":$("#opc").val()};
	$.ajax({
		beforeSend: function(){
			$('#resultado').html('Esperando...!');
		},
		data: param,
		url: 'rc',
		type: 'POST',
		success: function(response){
			alert(response);
		},
		error: function(jqXHR, estado, error){
		console.log(estado)
		console.log(error)
		},
		complete: function (jqXHR, estado){
			console.log(estado)
		}		
	});
});