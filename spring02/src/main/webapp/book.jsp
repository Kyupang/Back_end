<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>북마크 등록 화면입니다.</h3>
<hr>
<form action="insert3.gyu" method="get">
	name : <input name="name" value="naver"><br>
	url : <input name="url" value="http://www.naver.com"><br>
	image : <input name="image" value="4.jpg"><br>
	<button type="submit">서버로 전송</button>
</form>

<h3>수정 화면입니다. </h3>
<hr color="red">
<form action="update3.gyu" method="get">
	name : <input name="name" value="naver"><br>
	url : <input name="url" value="http://www.naver.com2"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>삭제 화면입니다. </h3>
<hr color="red">
<form action="delete3.gyu" method="get">
	name : <input name="name" value="naver"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>북마크 검색하기 </h3>
<hr color="red">
<form action="one3.gyu" method="get">
	id : <input name="id" value="2"><br>
	<button type="submit">북마크 검색</button>
</form>
<hr color="red">

<h3>북마크 전체 검색하기 </h3>
<hr color="red">
<a href="list3.gyu">전체 목록 가지고오기</a>
<hr color="red">

</body>
</html>