<%@page import="multi.MemberVo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="multi.MemberDAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 브라우저가 보낸 데이터를 받아야함. == 자바로 짜야함-->
<%
	MemberDAO2 dao = new MemberDAO2();
ArrayList<MemberVo> container = dao.list();
%>

<!-- 3. 브라우저에게 결과를 알려주기 위한 html 코드가 미리 들어가있음. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<!-- <a href="http://localhost:8888/web01/select_one.jsp?id=3">
		<button style ="background: purple">회원 목록 보고싶어~?</button>
	</a> -->


 <table class="table table-dark table-striped">
 <tr>
 	<td>id</td>
 	<td>pw</td>
 	<td>name</td>
 	<td>tel</td>
 </tr>
<% 
	for(MemberVo bag: container){
%>
<tr>
 	<td><%= bag.getId() %></td>
 	<td><%= bag.getPw() %></td>
 	<td>
 		<a href="http://localhost:8888/web01/select_one.jsp?id=<%= bag.getId() %>">
	 		<%= bag.getName() %>		
		</a>
 		
 	</td>
 	<td><%= bag.getTel() %></td>
 </tr>
 <% } %>
 </table>
</body>
</html>