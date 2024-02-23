<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% Enumeration<String> requestHeader = (Enumeration<String>) request.getAttribute("requestHeader"); %>
	
	<%
		while(requestHeader.hasMoreElements()){
			String name = requestHeader.nextElement();
			out.print(name+" : "+request.getHeader(name)+"<br>");
		}
	%>
	
</body>
</html>