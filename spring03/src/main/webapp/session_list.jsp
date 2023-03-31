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

<%
if(session.getAttribute("view")==null){
	out.print("아무도 방문하지 않았습니다.");
}else{
	out.print("방문 횟수는 " + session.getAttribute("view"));
}

%>
<hr>
</body>
</html>