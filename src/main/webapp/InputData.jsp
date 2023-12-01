<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="DataServlet" method="post">
		<label for="fname"> First Name : </label><input type="text" id="fname" name="fname"><br><br>
		<label for="dob"> DOB : </label><input type="text" id="dob" name="dob"><br><br>
		<samp>Gender : </samp><label for="male"> Male </label><input type="radio" id="male" name="gender" value="male">
		<label for="female"> Female </label><input type="radio" id="female" name="gender" value="female"><br><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>