<%@page import="com.multi.mvc200.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() { 
			content = $('#reply').val()
			writer= "apple"
			$.ajax({
				url:"insert4",
				data: {
					bbsno:${bag.no} ,
					content: content,
					writer: writer 
				},
				success: function() {
					$('#result').append("＠작성자 :" + writer+ "<br>"+
					">댓글 "+content + "<br>")
					$('#reply').val(' ')
				}
			})
		})
	})
</script>
<style>
body {
	background: yellow;
}
</style>
</head>
<body>
	<a href="bbs.jsp">처음페이지로</a>
	<a href="list2.gyu">게시물 전체 목록페이지</a>
	<hr color="red">

	게시물검색 처리 요청이 완료되었습니다.
	<br> ${bag.no} ,${bag.title} {${bag.writer}}
	<br> ${bag.content}
	<br>
	<hr color="red">
	댓글달기 <input id="reply"> <br>
	<button type="submit" id="b1">댓글 달기</button>
	
	<hr>
	<div id="result">
		<c:forEach items="${list}" var="bag">
			＠작성자 : ${bag.writer}<br>
			>댓글 ${bag.no}:  ${bag.content}<br>
		</c:forEach>
	</div>

</body>
</html>