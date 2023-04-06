<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입 화면입니다.</h3>
<hr>
<form action="insert.gyu" method="get">
	id : <input name="id" value="apple"><br>
	pw : <input name="pw" value="1234"><br>
	name : <input name="name" value="park"><br>
	tel : <input name="tel" value="011"><br>
	<button type="submit">서버로 전송</button>
</form>

<hr>
<h3>수정 화면입니다.</h3>
<form action="update.gyu" method="get">
	id : <input name="id" value="apple"><br>
	tel : <input name="tel" value="0111212"><br>
	<button type="submit">서버로 전송</button>
</form>

<hr>
<h3>삭제 화면입니다.</h3>
<form action="delete.gyu" method="get">
	id : <input name="id" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>

<hr>
<h3>하나 검색 화면입니다.</h3>
<form action="one.gyu" method="get">
	id : <input name="id" value="summer"><br>
	<button type="submit">서버로 전송</button>
</form>

<hr>
<h3>모든 회원 검색 화면입니다.</h3>
<a href= "list.gyu">모든 회원 리스트로 가져오기!</a>

<!-- <h3>로그인 화면입니다.</h3>
<hr>
<form action="login.gyu" method="get">
	id : <input name="id" value="apple"><br>
	pw : <input name="pw" value="1234"><br>
	<button type="submit">서버로 전송</button>
</form> -->
</body>
</html>