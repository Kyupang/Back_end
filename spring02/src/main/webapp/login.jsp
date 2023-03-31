<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면입니다.</title>
</head>
<body>
<%if(session.getAttribute("userid")==null){ %>
<h3>로그인 화면입니다.</h3>
<hr>
<form action="login.gyu" method="get">
	id : <input name="id" value="apple"><br>
	pw : <input name="pw" value="1234"><br>
	<button type="submit">서버로 전송</button>
</form>
<%} else{%>
<hr>
${userid}님이 로그인 중입니다.~!
<%}%>
<a href="bbs.jsp">
	<button>글쓰기 화면으로 이동</button>
</a>
</body>
</html>