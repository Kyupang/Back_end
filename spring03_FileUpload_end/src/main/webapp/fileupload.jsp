<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="uploadForm" method="post" enctype="multipart/form-data">
		영화포스터이미지 <input type="file" name="file"> <br>
		<button>서버로 파일업로드</button>
	</form>
</body>
</html>