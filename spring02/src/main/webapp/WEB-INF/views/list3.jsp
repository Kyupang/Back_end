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

<table>

<c:forEach var="vo" items="${list}"> 
<tr>
${vo.id}<br> <!-- 출력용 expression language EL  -->
${vo.name}<br>
${vo.url}<br>
<img src="resources/img/${vo.image}"><br>
<hr>
</tr>
</c:forEach>
</table>
</body>
</html>

