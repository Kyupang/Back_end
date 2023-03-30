<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
로그인한 사람의 id는 <%= session.getAttribute("user") %>
오늘 방문횟수는 ? <%= session.getAttribute("count") %>
<hr>
</body>
</html>