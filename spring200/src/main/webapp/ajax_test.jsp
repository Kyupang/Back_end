<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#result').empty()
		$.ajax({
			url: "list5.gyu",
			success: function(x) {
				$('#result').append(x)
			}
		})
		
		
		
		$('#b1').click(function() {
			//기존의 것이 삭제됨.
			$('#result').empty()
			$.ajax({
				url: "list5.gyu",
				success: function(x) {
					$('#result').append(x)
				}
			})
		})
		
		$('#b2').click(function() {
			//기존의 것이 삭제됨.
			$('#result').empty()
			$.ajax({
				url: "list6.gyu",
				data: {
					bbsno: 1
				},
				success: function(x) {
					$('#result').append(x)
				}
			})
		})
		
		
		$('#b3').click(function() {
			//기존의 것이 삭제됨.
			$('#result').empty()
			$.ajax({
				url: "list6.gyu",
				data: {
					bbsno: 30
				},
				success: function(x) {
					$('#result').append(x)
				}
			})
		})
		
		
		$('#b4').click(function() {
			//기존의 것이 삭제됨.
			$('#result').empty()
			$.ajax({
				url: "list.gyu",
				data: {
					id : "apple"
				},
				success: function(x) {
					$('#result').append(x)
				}
			})
		})
		$('#b5').click(function() {
			//기존의 것이 삭제됨.
			$('#result').empty()
			$.ajax({
				url: "one3.gyu",
				data: {
					no :1
				},
				success: function(x) {
					$('#result').append(x)
				}
			})
		})
		
		$('#b6').click(function() {
			$.ajax({
				url: "update.gyu",
				data: {
					no : $('#no').val(),
					content : $('#content').val()
				},
				success: function(x) {
					$('#result').append(x)
				}
			})
		})
		
		$('#b7').click(function() {
			$.ajax({
				url: "delete3.gyu",
				data: {
					no : $('#no2').val(),
				},
				success: function(x) {
					$('#result').append(x)
				}
			})
		})
		
		
		
		
	})
</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<button id="b1">bbs리스트 가지고 오기</button>

<button id="b2">reply 리스트 가지고 오기</button>
<button id="b3">bbs 번호 30 reply 리스트 가지고 오기</button>
<button id="b4">memberid 가 apple인 사람 정보 가져오기</button>
<button id="b5">bbsno가 1인 사람 정보 가져오기</button>
<hr>
수정할 번호, 내용 입력 
<input id="no" value="1">
<input id="content" value="안녕하세요 수정된 내용입니다만?"><br>
<button id="b6">내용 수정버튼!</button><br>
<hr>
삭제할 번호 입력
<input id="no2" value="3">
<button id="b7">컨텐츠 삭제버튼!</button>
<hr>

<button id="b8">전국주간날씨~</button>

<hr color ="red">
<div id="result" style="background:yellow"></div>
</body>
</html>