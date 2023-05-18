<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body background="lime">
이미지 업로드 성공!!<img src="resources/upload/${bbs2VO.file_name}" width=300 height=300>> <br>
<hr color="red">
등록된 게시판 아이디는 ${bbs2VO.bbs_id} <br>
등록된 게시판 내용은 ${bbs2VO.content} <br>
등록된 작성자는 ${bbs2VO.writer} <br>

<a href="bbs_one?movie_id=${bbs2VO.bbs_id}">등록한 영화 하나 확인</a>
</body>
</html>