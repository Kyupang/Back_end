<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	session.setAttribute("id", "gyu");
%>

<hr>
로그인성공
<a href="getsessionvalue.jsp">session속성가지고오기</a>
</body>
</html>