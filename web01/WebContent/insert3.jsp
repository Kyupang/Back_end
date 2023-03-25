<%@page import="multi.ProductVO"%>
<%@page import="multi.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 브라우저가 보낸 데이터를 받아야함. == 자바로 짜야함-->
<jsp:useBean id="bag" class= "multi.ProductVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag"/>
<%
/*	//자바코드 넣는 부분 
//HttpServletRequest request = new HttpServletRequest();
//tomcat은 미리 request를 미리 만들어서 내장시켜놓았음 
String id = request.getParameter("id");
String name = request.getParameter("name");
String content = request.getParameter("content");
String price = request.getParameter("price");
String company = request.getParameter("company");
String img = request.getParameter("img");

ProductVO bag = new ProductVO();
bag.setId(id);
bag.setName(name);
bag.setContent(content);
bag.setPrice(Integer.parseInt(price));
bag.setCompany(company);
bag.setImg(img); */


ProductDAO dao = new ProductDAO();
dao.insert(bag);


%>

<!-- 3. 브라우저에게 결과를 알려주기 위한 html 코드가 미리 들어가있음. -->
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
상품등록이 완료되었음.
<hr color = "red">
id = <%= bag.getId() %> <br>
name = <%= bag.getName() %> <br>
content = <%= bag.getContent() %> <br>
price = <%= bag.getPrice() %> <br>
company = <%= bag.getCompany() %> <br>
<img src= "img/<%= bag.getImg() %>" width= 200 height =200>

</body>
</html>