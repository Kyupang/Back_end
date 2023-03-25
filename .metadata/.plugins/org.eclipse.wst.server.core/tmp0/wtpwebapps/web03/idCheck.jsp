<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
	String id = request.getParameter("id");
	String [] list ={"root","admin","home"};
	String result = "중복이 되지 않아, 사용 가능";
	
	for(String x : list){
		if (x.equals(id)){
			result = "중복된 id이므로, 사용불가능";
			break;
		}
	}
%><%=result%>