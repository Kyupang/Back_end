<%@page import="multi.MemberVo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="multi.MemberDAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 브라우저가 보낸 데이터를 받아야함. == 자바로 짜야함-->
<%
	//자바코드 넣는 부분 
//HttpServletRequest request = new HttpServletRequest();
//tomcat은 미리 request를 미리 만들어서 내장시켜놓았음 
String id = request.getParameter("id");

MemberDAO2 dao = new MemberDAO2();
MemberVo result = dao.select_one(id);

String id2 = result.getId();
String pw2 = result.getPw();
String name2 = result.getName();
String tel2 = result.getTel();
%>

<!-- 3. 브라우저에게 결과를 알려주기 위한 html 코드가 미리 들어가있음. -->
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="UTF-8">
<style type="text/css">
body {
	background: pink;
}
</style>

</head>
<body>


	검색결과
	<hr color="red">
	<table class="table table-dark table-striped">
		<tr>
			<td>검색한 제목</td>
			<td><%=id2%></td>
		</tr>
		<tr>
			<td>검색한 비밀번호</td>
			<td><%=pw2%></td>
		</tr>
		<tr>
			<td>검색한 이름</td>
			<td><%=name2%></td>
		</tr>
		<tr>
			<td>검색한 사람 번호</td>
			<td><%=tel2%></td>
		</tr>
	</table>
	<hr color="red">
	검색 결과는요 =
	<br> id =
	<%=id2%>
	<br> pw2 =
	<%=pw2%>
	<br> name2 =
	<%=name2%>
	<br> tel2 =
	<%=tel2%>
	<br>
</body>
</html>