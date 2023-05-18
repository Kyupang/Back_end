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
			url : 'tour',
			success: function(x) { //x는 테이블 형태
				$('#result').html(x)
			}
		})
	})
	$('#b2').click(function() {
		$.ajax({
			url : 'fruit',
			success: function(x) { //x는 테이블 형태
				$('#result').html(x)
			}
		})
	})
})
</script>
</head>
<body>
<button id="b1">내가 좋아하는 여행지 목록</button> <br>
<button id="b2">내가 좋아하는 과일 목록</button> <br>
<div id="result"></div>
</body>
</html>