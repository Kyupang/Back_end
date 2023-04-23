<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>뉴스 페이지 입니다.</h3>
<hr>
<img src="resources/img/google.png">

대통령실은 전날에도 "국민의 건강과 안전이 최우선이라는 정부 입장에 변함이 없다"며 "후쿠시마산 수산물이 국내로 들어올 일은 결코 없을 것"이라고 밝힌 바 있다.

일본 언론이 한일 정상회담에서 후쿠시마산 수산물 수입제한 철폐와 관련한 논의가 이뤄졌다는 보도를 연일 이어가는 상황에서 쐐기를 박겠다는 취지로 보인다.

대통령실은 후쿠시마 오염수와 관련해서도 "윤 대통령은 정상회담 기간 중 일본측 인사들과 만난 자리에서 후쿠시마 오염수에 대해서는 객관적이고 과학적인 방식, 국제기준에 부합하는 검증, 그 과정에 한국 전문가가 참여해야 한다는 3가지 조건을 분명히 했다"고 강조했다.

<%if(session.getAttribute("id")!=null){ %>
	<form action="aaa">
		댓글:<input name="reply"><button>댓글달기</button>
	</form>
<%} %>

</body>
</html>