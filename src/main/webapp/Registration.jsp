<%@page import="com.controller.RegistartionError"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<form action="RegistartionServlet" method="post">
    <label for="fname">First Name: </label>
    <input type="text" id="fname" name="fname">
    <span style="color: red"> ${error.fname }</span>
    <br><br>
    <label for="email">Email: </label>
    <input type="email" id="email" name="email">
    <span style="color: red"> ${error.email } </span>
    <br><br>
    <label for="password">Password: </label>
    <input type="password" id="password" name="password">
    <span style="color: red"> ${error.password } </span>
  	<br><br>
    <input type="submit">
</form>

</body>
</html>
