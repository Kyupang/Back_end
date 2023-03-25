<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String tel = request.getParameter("tel");
	String result ="";
	String pre = tel.substring(0,3);
	switch(pre){
	case "010":
		result = result+"100";
		break;
	case "011":
		result = result+"111";
		break;
	default:
		result="222";
	}
	Random r = new Random();
	int post = r.nextInt(900)+100;
	result+= post;
%><%=result%>