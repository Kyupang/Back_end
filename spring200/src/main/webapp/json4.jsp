<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
//스크릿트릿 
	JSONObject json = new JSONObject();
	json.put("high", 70000); 
	json.put("low", 65000); 
	json.put("end", 68000); 
	
	JSONObject json2 = new JSONObject();
	json2.put("high", 75000); 
	json2.put("low", 63000); 
	json2.put("end", 74000); 
	
	JSONArray array = new JSONArray();
	array.add(json);
	array.add(json2);
	
%><%= array.toJSONString() %>