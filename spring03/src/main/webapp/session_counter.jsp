<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%session.setAttribute("count", 100); %>
시작 현재 카운트 : <%= session.getAttribute("count") %> , ${count}
<hr color = "red">
<a href="getsessionvalue.jsp"> session속성 가지고오기 2</a>
</body>
</html>