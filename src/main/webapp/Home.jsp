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
	<h1>Home page Welcome</h1>
	<%
	String fname = (String) request.getAttribute("firstName");
	String dob = (String) request.getAttribute("dob");
	String gender = (String) request.getAttribute("gender");
	%>
	<h2>First Name: ${data.fName} </h2>
	<h2>DOB: <%=dob %></h2>
	<h2>Gender: ${data.gender }</h2>
</body>
</html>