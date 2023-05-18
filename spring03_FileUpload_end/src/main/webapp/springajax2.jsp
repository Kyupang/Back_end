<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.1.js"></script>
<script type="text/javascript">
$(function(){
	$('#b1').click(function() {
		$.ajax({
			url : 'movie',
			data: {
				title : $('#title').val(),
				price : $('#price').val()
			}, 
			success: function(x) { //x는 테이블 형태
				$('#result').html(x)
			}
		})
	})
})
</script>
</head>
<body>
영화제목: <input id="title"> <br>
영화관람료: <input id="price"> <br>
<button id="b1">컴퓨터 구매 항목 확인</button> <br>
<div id="result"></div>
</body>
</html>