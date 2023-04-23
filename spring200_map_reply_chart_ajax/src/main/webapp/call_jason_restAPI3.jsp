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
				url: "one22.gyu",
				data :{
					no:2
				},
				dataType : "json",
				success: function(json) {
					no = json.no
					content = json.content
					$('#result').append(no+ " "+ content+"<br>")
				} //success
			}) //ajax
		})//b3
		
		$('#b11').click(function() {
			$.ajax({
				url: "list55.gyu",
				dataType : "json",
				success: function(json) {
					no= json[4].no
					content = json[4].content
					$('#result').append("json 리스트 중 5번째꺼 " + no+ " " + content +"<br>" )
				} //success
			}) //ajax
		})//b11
		
	})
	
</script>

</head>
<body>
<button id="b1">컨트롤러에서 bbs JSON을 받아오자.!</button>
<button id="b11">컨트롤러에서 bbs array JSON(다른 모양, table, li)을 받아오자.!</button>

<div id="result"></div>
</body>
</html>