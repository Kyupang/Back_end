<%@page import="multi.WebtoonDAO"%>
<%@page import="multi.WebtoonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String star = request.getParameter("star");
	
	WebtoonVO bag = new WebtoonVO();
	bag.setId(id);
	bag.setStar(star);
	
	WebtoonDAO dao = new WebtoonDAO();
	dao.update(bag);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
body{
	background: pink;
}

</style>

</head>
<body>
수정되었음.
<hr color = "red">
수정하고 싶은 웹툰id = <%= id %> <br>
수정한 별점 = <%= star%> <br> 


</body>
</html>