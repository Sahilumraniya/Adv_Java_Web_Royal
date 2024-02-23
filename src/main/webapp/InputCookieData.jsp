<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div>
		<br>
		<br>
		<form method="post" action="InputCookieServlet">
			cookie Name : <input type="text" name="cName"> <br> <br>
			cookie Value : <input type="text" name="cValue"> <br> <br>
			<input type="submit" value="Submit">
		</form>
		<br><br>
		<a href="ShowAllCookie.jsp">Show Cookie</a>
	</div>
</body>
</html>