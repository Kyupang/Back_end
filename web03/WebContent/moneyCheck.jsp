<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    
    String money = request.getParameter("money");
    String choice = request.getParameter("choice");
    
    int money2 = Integer.parseInt(money);
    int result=0;
   
    if(choice.equals("1")){
  	  result = money2 -1000;
    }else if(choice.equals("2")){
  	  result = money2 +1000;
    }else{
  	  result = money2;
    }
%><%=result%>