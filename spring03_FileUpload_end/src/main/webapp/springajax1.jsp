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
			url : 'computer',
			data: {
				com : $('#com').val(),
				price : $('#price').val(),
				mouse : $('#mouse').val(),
				price2 : $('#price2').val()
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
컴퓨터종류: <input id="com"> <br>
컴퓨터가격: <input id="price"> <br>
마우스종류: <input id="mouse"> <br>
마우스가격: <input id="price2"> <br>
<button id="b1">컴퓨터 구매 항목 확인</button> <br>
<div id="result"></div>






</body>
</html>