<%@page import="multi.WebtoonVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="multi.WebtoonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
WebtoonDAO dao = new WebtoonDAO();
ArrayList<WebtoonVO> list = dao.list();
%>


<!DOCTYPE html>
<html lang="en">
<head>
  <title>Webtoon_list</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Webtoon_list</h2>
  
    	<% if(list.size() == 0) { %>
		<h3>등록된 영화가 없습니다.</h3>
		<%}else{ %>
  <table class="table">
    <thead>
      <tr class ="table-danger">
        <th>웹툰 ID</th>
        <th>웹툰 TITLE</th>
        <th>CARTOONIST</th>
      </tr> 
    </thead>
    <tbody>
		 
		<% 
			for(WebtoonVO bag2: list){
		%>
		 <tr class ="table-info">
		 	<td><%= bag2.getId() %></td>
		 	<td>
		 	        <!-- one4.jsp?id=102 -->
		 		<a href="webtoon_each_info.jsp?id=<%= bag2.getId() %>">
					<%= bag2.getTitle() %>
				</a>
		 	</td>
		 	
		 	<td><%= bag2.getCartoonist() %></td>
		 </tr>
    
		 <% } //for %>
    </tbody>
  </table>
<% } //else %>
</div>

</body>
</html>