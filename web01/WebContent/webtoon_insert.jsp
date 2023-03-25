<%@page import="multi.WebtoonDAO"%>
<%@page import="multi.WebtoonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		//자바코드 넣는 부분 
	//HttpServletRequest request = new HttpServletRequest();
	//tomcat은 미리 request를 미리 만들어서 내장시켜놓았음 
	String id = request.getParameter("id");
	String title = request.getParameter("title");
	String cartoonist = request.getParameter("cartoonist");
	String star = request.getParameter("star");
	String img = request.getParameter("img");
	
	WebtoonVO bag = new WebtoonVO();
	bag.setId(id);
	bag.setTitle(title);
	bag.setCartoonist(cartoonist);
	bag.setStar(star);
	bag.setImg(img);
	
	
	WebtoonDAO dao = new WebtoonDAO();
	dao.insert(bag);
	%>

<!-- 3. 브라우저에게 결과를 알려주기 위한 html 코드가 미리 들어가있음. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
body {
	background: pink;
}
</style>

</head>
<body>
	등록이 요청되었음.
	<hr color="red">
	등록된 id = <%=id%><br>  
	등록된 title = <%=title%><br> 
	등록된 cartoonist = <%=cartoonist%><br> 
	등록된 star point =<%=star%><br>
	등록된 img =<%=img%><br>
	
	<br>
</body>
</html>