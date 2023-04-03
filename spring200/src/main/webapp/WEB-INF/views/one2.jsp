<%@page import="com.multi.mvc200.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	댓글달기 <input id="reply"><br>
	<button type="submit" id="b1">댓글 달기</button>
	<hr>
	<div id="result">

		<c:forEach items="${list}" var="bag">
			<table>
				<tr>
					<td class="down">댓글 ${bag.no}: </td>
					<td class="down">${bag.content}</td>
					<td class="down">//작성자 : ${bag.writer}</td>
				</tr>
				<hr>
			</table>
		</c:forEach>

	</div>

</body>
</html>