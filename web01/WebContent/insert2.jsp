<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 브라우저가 보낸 데이터를 받아야함. == 자바로 짜야함-->

<%
	//자바코드 넣는 부분 
//HttpServletRequest request = new HttpServletRequest();
//tomcat은 미리 request를 미리 만들어서 내장시켜놓았음 
String no = request.getParameter("no");
String title = request.getParameter("title");
String content = request.getParameter("content");
String writer = request.getParameter("writer");

%>

<!-- 3. 브라우저에게 결과를 알려주기 위한 html 코드가 미리 들어가있음. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
body{
	background: pink;
}

</style>

</head>
<body>
글쓰기가 완료되었슴 
<hr color = "red">
no = <%= no %> <br>
title = <%= title %> <br>
content = <%= content %> <br>
writer = <%= writer%> <br> 
</body>
</html>