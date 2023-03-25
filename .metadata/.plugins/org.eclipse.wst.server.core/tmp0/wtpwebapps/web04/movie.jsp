<%@page import="multi.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag"/>
<%
	MovieDAO dao = new MovieDAO();
	dao.insert(bag);
%>