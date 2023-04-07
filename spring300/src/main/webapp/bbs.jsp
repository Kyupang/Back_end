<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시판 등록 화면입니다.</h3>
<hr>
<form action="insert2.gyu" method="get">
	title : <input name="title" value="금요일"><br>
	content : <input name="content" value="오늘은 금요일~"><br>
	writer : <input name="writer" value="gyu"><br>
	<button type="submit">서버로 전송</button>
</form>

<hr>
<h3>수정 화면입니다.</h3>
<form action="update2.gyu" method="get">
	no: <input name="no" value="2"><br>
	content : <input name="content" value="0111212"><br>
	<button type="submit">서버로 전송</button>
</form>

<hr>
<h3>삭제 화면입니다.</h3>
<form action="delete2.gyu" method="get">
	no : <input name="no" value="2"><br>
	<button type="submit">서버로 전송</button>
</form>

<hr>
<h3>하나 검색 화면입니다.</h3>
<form action="one2.gyu" method="get">
	no : <input name="no" value="9"><br>
	<button type="submit">서버로 전송</button>
</form>

<hr>
<h3>모든 회원 검색 화면입니다.</h3>
<a href= "list2.gyu">모든 회원 리스트로 가져오기!</a>

<!-- <h3>로그인 화면입니다.</h3>
<hr>
<form action="login.gyu" method="get">
	id : <input name="id" value="apple"><br>
	pw : <input name="pw" value="1234"><br>
	<button type="submit">서버로 전송</button>
</form> -->
</body>
</html>