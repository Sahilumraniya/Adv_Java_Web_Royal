<%@page import="com.controller.RegistrationData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Home</h1>
	<%RegistrationData data = (RegistrationData) request.getAttribute("data"); %>
	<h2>First Name: <%=data.fname %></h2>
	<h2>Email: <%=data.email %></h2>
	<h2>Password: <%=data.password %></h2>
</body>
</html>