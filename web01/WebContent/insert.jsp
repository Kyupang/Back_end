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
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		
		MemberVo bag = new MemberVo();
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		MemberDAO2 dao = new MemberDAO2();
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
	회원가입 요청되었음.
	<hr color="red">
	가입한 id = <%=id%><br>  
	가입한 pw = <%=pw%><br> 
	가입한 name = <%=name%><br> 
	가입한 tel =<%=tel%><br>
	<br>
</body>
</html>