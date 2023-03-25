<%@page import="multi.WebtoonVO"%>
<%@page import="multi.WebtoonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    	String id = request.getParameter("id"); 
    	
    	WebtoonDAO dao = new WebtoonDAO();
    	WebtoonVO bag2 = dao.select_one(id);
    %>
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
<div class="container">
<h3>Webtoon Title <%= bag2.getTitle() %></h3>
<hr color="red">
 
 	<tr>
		<td class="t1">웹툰 목록에 추가</td>
		<td>
			<a href ="webtoon_insert.html">
				<button>GO!!</button>
			</a>
		</td>
		
	    <td class="t1">웹툰 별점 수정</td>
		<td>
			<a href ="webtoon_update.html">
				<button>GO!!</button>
			</a>
		</td>
		
		<td class="t1">웹툰 목록에서 제거</td>
		<td>
			<a href ="webtoon_delete.html">
				<button>GO!!</button>
			</a>
		</td>
	</tr>
	<hr>
	
 <table class="table table-warning table-striped">
 	<tr>
 		<td>웹툰 ID</td>
 		<td><%= bag2.getId() %></td>
 	</tr>
 	<tr>
 		<td>웹툰 제목</td>
 		<td><%= bag2.getTitle() %></td>
 	</tr>
 	<tr>
 		<td>웹툰 작가</td>
 		<td><%= bag2.getCartoonist() %></td>
 	</tr>
 	<tr>
 		<td>웹툰 별점</td>
 		<td><%= bag2.getStar() %></td>
 	</tr>
 	<tr>
 		<td>웹툰 썸네일</td>
 		<td>
			<img src= "img/<%= bag2.getImg() %>" width= 200 height =200>
		</td>
 	</tr>
 </table>
 </div>
</body>
</html>