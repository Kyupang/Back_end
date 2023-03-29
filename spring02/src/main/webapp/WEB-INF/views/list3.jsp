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

<c:forEach var="vo" items="${list}"> 
id >> ${vo.id}<br> <!-- 출력용 expression language EL  -->
name >> ${vo.name}<br>
url >> ${vo.url}<br>
<img src="resources/img/${vo.image}"><br>
</c:forEach>
</body>
</html>

