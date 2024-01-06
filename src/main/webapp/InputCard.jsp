<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="CardServlet" method="post">
		<label for="a">A : </label> <input name="a" > <p style="color : red"> ${aError} </p> <br> <br>
		<label for="b">B : </label> <input name="b" > <p style="color : red"> ${bError} </p> <br> <br>
		<input type="submit" value="submit">
	</form>
</body>
</html>