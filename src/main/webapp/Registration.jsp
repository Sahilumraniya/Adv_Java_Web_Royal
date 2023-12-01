<%@page import="com.controller.RegistartionError"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

 <%RegistartionError error = (RegistartionError) request.getAttribute("error"); %>

<form action="RegistartionServlet" method="post">
    <label for="fname">First Name: </label>
    <input type="text" id="fname" name="fname">
    <%
	if (error != null && error.getFname() != null) {
	%>  
    	<small style="color: red"><%=error.getFname() %></small>
    <%
	}
	%><br><br>
    <label for="email">Email: </label>
    <input type="email" id="email" name="email">
    <%
	 if (error != null && error.getEmail() != null) {
	%>  
    	<small style="color: red"><%=error.getEmail() %></small>
    <%
	}
	%><br><br>
    <label for="password">Password: </label>
    <input type="password" id="password" name="password">
  	<%
	if (error != null && error.getPassword() != null) {
	%>  
    	<small style="color: red"><%=error.getPassword() %></small>
    <%
	}
	%><br><br>
    <input type="submit">
</form>

</body>
</html>
