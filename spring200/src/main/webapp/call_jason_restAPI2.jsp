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
				url: "json1",
				dataType : "json",
				success: function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel
					$('#result').append(id+pw+name+tel+"<br>")
				} //success
			}) //ajax
		})//b3
		
		$('#b11').click(function() {
			$.ajax({
				url: "json1",
				dataType : "json",
				success: function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel //json에서 tel키로 값을 추출
					table = "<table><tr><td>항목명</td><td>값</td></tr>" + 
					"<tr><td>아이디</td><td>" + id +"</td></tr>" + 
					"<tr><td>패스워드</td><td>" + pw +"</td></tr>" + 
					"<tr><td>이름</td><td>" + name +"</td></tr>" + 
					"<tr><td>전화번호</td><td>" + tel +"</td></tr></table>"
					$('#result').append(table)
				} //success
			}) //ajax
		})//b11
		
		
		$('#b2').click(function() {
			$.ajax({
				url: "json2",
				dataType : "json",
				success: function(json) {
					id1 = json[0].id
					pw1 = json[0].pw
					name1 = json[0].name
					tel1 = json[0].tel
					
					id2 = json[1].id
					pw2 = json[1].pw
					name2 = json[1].name
					tel2 = json[1].tel
					
					$('#result').append(id1+"    "+id2)
					
				} //success
			}) //ajax
		})//b2
		
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
<button id="b1">컨트롤러에서 JSON을 받아오자.!</button>
<button id="b11">컨트롤러에서 JSON(다른 모양, table, li)을 받아오자.!</button>
<button id="b2">컨트롤러에서 JSONArray를 받아오자.!</button>

<hr>

<button id="b3">컨트롤러에서 JSON3을 받아오자.!</button>
<button id="b4">컨트롤러에서 JSONArray4를 받아오자.!</button>
<hr color="red">
<div id="result"></div>
</body>
</html>