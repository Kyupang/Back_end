<%@page import="com.multi.mvc01.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
//세션에서 값을 꺼내는 방법 
String userid = (String)session.getAttribute("userid");
//모델에서 값을 꺼내는 방법 
//model.addAttribute("bag", bag);
BbsVO bag = (BbsVO)request.getAttribute("bag");
String writer = bag.getWriter();

%>
<a href="bbs.jsp">처음 페이지로</a>
<%if(userid.equals(writer)){ %>
<a href="update2.gyu">
	<button>수정</button>
</a>
<a href="delete2.gyu?no=${bag.no}">
	<button>삭제</button>
</a>
<%} %>
<a href="list2.gyu">게시물 전체 목록 페이지</a>
게시물 검색 처리 요청이 완료되었습니다.
<br>
${bag.no}
${bag.title}
${bag.writer}
${bag.content}

</body>

</html>
