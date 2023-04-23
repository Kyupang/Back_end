<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				<td>${vo.id}<br></td>
				<td>${vo.title}<br></td>
				<td>${vo.cartoonist}<br></td>
				<td>${vo.star}<br></td>
				<td><a href=""><img src="resources/img/${vo.img}"></a><br></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>