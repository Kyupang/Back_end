<%@page import="multi.WebtoonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");

	WebtoonDAO dao = new WebtoonDAO();
	dao.delete(id);

%>

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
웹툰 목록에서 제거가 요청되었음.
<hr color = "red">
제거할 웹툰 아이디 = <%= id %> <br>
</body>
</html>