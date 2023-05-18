<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/menuCss.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>

</head>
<body>
	<div id="total">
		<div id="center">
			<h3 style="text-align: center;">게시판 글쓰기 페이지</h3>
			<hr color="red">
			<form 	action="insert3" 
					method="post"
					enctype="multipart/form-data">
				
				<span class="input-group-text">제목</span> 
				<input type="text" class="form-control input-sm" name="title"><br>
				 
				<span class="input-group-text">첨부파일</span> 
				파일 선택: <input type="file" name="file"><br>
				 
				<span class="input-group-text">작성자</span>
				<input type="text" class="form-control" name="writer"><br>
				
				<span class="input-group-text">내용</span> 
				<input type="text" class="form-control" name="content"><br> 
				
				<button type="submit" class="btn btn-secondary">글쓰기 등록</button>
			</form>
		</div>
	</div>
</body>
</html>