<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lime">
검색한 북마크입니다.
<hr> 
검색한 id: ${vo.id} <br> <!-- el: expression language, 속성으로 지정한 것만 프린트! -->
검색한 name: ${vo.name} <br> <!-- vo.getName() --> 
검색한 url: ${vo.url} <br>
검색한 img: ${vo.img} <br>
</body>
</html>