<%@page import="multi.MemberDAO2"%>
<%@page import="multi.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 브라우저가 보낸 데이터를 받아야함. == 자바로 짜야함-->
<%
	//자바코드 넣는 부분 
//HttpServletRequest request = new HttpServletRequest();
//tomcat은 미리 request를 미리 만들어서 내장시켜놓았음 
String id = request.getParameter("id");
String tel = request.getParameter("tel");

MemberVo bag = new MemberVo();
bag.setId(id);
bag.setTel(tel);

MemberDAO2 dao = new MemberDAO2();
dao.update(bag);
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
수정되었음.
<hr color = "red">
수정하고 싶은 id = <%= id %> <br>
수정한 tel = <%= tel%> <br> 


</body>
</html>