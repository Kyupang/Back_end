<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- content delivery network  : CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url: "json.jsp",
				dataType : "json",
				success: function(json) {
					age1 = json.age
					name1 = json.name
					id1 = json.id
					$('#result').append(age1 + " " + name1 + " " + id1 + "<br>")
				} //success
			}) //ajax
		})//b3
		$('#b3').click(function() {
			$.ajax({
				url: "json3.jsp",
				dataType : "json",
				success: function(json) {
					today = json.today
					temp = json.temp
					hu = json.hu
					$('#result').append(today + " " + temp + " " + hu + "<br>")
					if(today == 'rain') {
						$('#result').append("<img src=resources/img/rain.png><br>")
					}else if(today == 'sun'){
						$('#result').append("<img src=resources/img/sun.jpg><br>")
					}
				} //success
			}) //ajax
		})//b1
		$('#b2').click(function() {
			$.ajax({
				url: "json2.jsp",
				dataType : "json",
				success: function(json) {
					age1 = json[1].age
					name1 = json[1].name
					id1 = json[1].id
					$('#result').append(age1 + " " + name1 + " " + id1 + "<br>")
					
				} //success
			}) //ajax
		})//b2
		$('#b4').click(function() {
			$.ajax({
				url: "json4.jsp",
				dataType : "json",
				success: function(json) {
					high1 = json[0].high
					low1 = json[0].low
					end1 = json[0].end
					
					high2 = json[1].high
					low2 = json[1].low
					end2 = json[1].end
					$('#result').append("어제 주가: " + high1 + " " + low1 + " " + end1 + "<br>")
					$('#result').append("오늘 주가: " + high2 + " " + low2 + " " + end2 + "<br>")
					
				} //success
			}) //ajax
		})//b4
	})//$
</script>

</head>
<body>
<button id="b1">JSON을 받아오자.!</button>
<button id="b2">JSONArray를 받아오자.!</button>
<button id="b3">JSON3을 받아오자.!</button>
<button id="b4">JSONArray4를 받아오자.!</button>
<hr color="red">
<div id="result"></div>
</body>
</html>