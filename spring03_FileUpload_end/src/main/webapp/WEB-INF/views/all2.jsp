<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr>
<c:forEach var="vo" items="${list}">
검색한 id: ${vo.id} <br> <!-- el: expression language, 속성으로 지정한 것만 프린트! -->
검색한 name: ${vo.name} <br> <!-- vo.getName() --> 
검색한 url: ${vo.url} <br>
검색한 img: ${vo.img} <br>
<hr color="red">
</c:forEach>
</body>
</html>