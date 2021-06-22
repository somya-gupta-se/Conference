$(document).ready(function(){
	$.ajax({
		url: "http://localhost:8080/conference/user"
	}).then(function(data){
		$('.firstname').append(data.firstName);
		$('.lastname').append(data.lastName);
		$('.age').append(data.age);
	});
});
