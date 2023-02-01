<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body style="margin:40px;">
	<form action="/song/insert" method="post">
		ID: <input type="text" name="sid">
		title: <input type="text" name="title">
		lyrics: <input type="text" name="lyrics">
		<button type="submit">제출</button>
	</form>
</body>
</html>