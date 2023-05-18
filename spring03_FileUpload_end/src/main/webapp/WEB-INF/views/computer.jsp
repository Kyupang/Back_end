<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  ajax의 views아래 jsp파일에는 부분코드만 넣자. -->
<!-- 
	success: function(x) { //x에 들어가는 코드부분만 넣자.!!
		$('#result').html(x)
 -->
 <table border="1" bordercolor="red">
 	<tr style="background: lime; ">
 		<td>항목명</td>
 		<td>금액</td>
 	</tr>
 	<tr style="background: yellow; text-align: right; ">
 		<td style="width:100px;">${vo.com}</td>
 		<td style="width:200px;">${vo.price}</td>
 	</tr>
 	<tr style="background: yellow; text-align: right;">
 		<td style="width:100px;">${vo.mouse}</td>
 		<td style="width:200px;">${vo.price2}</td>
 	</tr>
 	<tr style="background: lime; text-align: right;">
 		<td>총합계</td>
 		<td>${vo.sum}</td>
 	</tr>
 </table>