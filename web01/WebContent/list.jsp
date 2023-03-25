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

<style type="text/css">
body {
	background: pink;
}
</style>
</head>

<body>
	검색결과
	<hr color="red">
	<table border= "1">
		<tr>
			<td width="200" bgcolor="yellow" align="center">회원 ID</td>
			<td width="200" bgcolor="yellow" align="center">회원 PW</td>
			<td width="200" bgcolor="yellow" align="center">회원 NAME</td>
			<td width="200" bgcolor="yellow" align="center">회원 TEL</td>
		</tr>
		<%
			for (int i = 0; i < container.size(); i++) {
				MemberVo bag = container.get(i);
		%>
		<tr>
			<td width="200" align="center"><%out.print(bag.getId());%></td>
			<td width="200" align="center"><%out.print(bag.getPw());%></td>
			<td width="200" align="center"><%out.print(bag.getName());%></td>
			<td width="200" align="center"><%out.print(bag.getTel());%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>