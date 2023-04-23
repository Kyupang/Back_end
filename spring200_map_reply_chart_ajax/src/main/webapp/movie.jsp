<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() { //body 부분이 dom tree로 메모리에 준비가 되었을 때 
	//입력값으로 넣은 함수를 실행해주세요 .
		$('#b2').click(function() {
			$.ajax({
				url:"movie",		
				data:{
					title:$('#title').val(),
					price:$('#price').val(),
				},
				success: function(x){
					$('#result').append(x + "<br>")
				},
				error: function(){
				}
			})
		})
		
		
		$('#b4').click(function() {
			$.ajax({
				url:"tour",		
				success: function(x){
					$('#result').append(x + "<br>")
				}
			})
		})
		
	})

</script>
</head>
<body>
영화 제목 : <input id="title" value="tenet"><br>
영화 가격 : <input id="price" value="10000"><br>
<input id="b2" type="button" value="영화구매확인">
<hr color = "red">
여행 목록 : <input id="b4" type="button" value="여행목록 가지고 오기">
	<br>
<div id ="result"></div>

</body>
</html>