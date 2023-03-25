<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><% 
	int dollar = Integer.parseInt(request.getParameter("dollar"));
	int won = 1283;
	int result = dollar*won;
%><%=result%>

	