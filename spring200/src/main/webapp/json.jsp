<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	JSONObject json = new JSONObject();
	json.put("id", "apple");
	json.put("pw", "1234");
	json.put("age", 100);
	json.put("tel", "123451551");
%>	
<%=json.toJSONString()%>