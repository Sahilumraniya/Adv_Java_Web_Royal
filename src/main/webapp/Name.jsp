<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="NameServlet" method="post">
		<label id="name">Name : </label>
		<input type="text" name="name" id="name"></input> <samp style="color:red"> ${nameError } </samp> <br><br>
		<input type="submit" value="submit" >
	</form>
</body>
</html>