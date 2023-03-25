<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><% 
	int won = Integer.parseInt(request.getParameter("won"));
	int dollar2 = 1283;
	int result = won/dollar2;
%><%=result%>

	