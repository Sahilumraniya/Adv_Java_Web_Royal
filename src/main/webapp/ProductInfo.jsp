<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		ResultSet rs = (ResultSet)request.getAttribute("rs");
		rs.next();
		int productId = rs.getInt("productId");
		String name = rs.getString("name");
		String category = rs.getString("category");
		int price = rs.getInt("price");
		int qty = rs.getInt("qty");
	%>
	<h1> Name : <%=name %> </h1>
	<h3> Category : <%=category %> </h3>
	<h3> Price : <%=price %> </h3>
	<h3> Qty : <%=qty %> </h3>
</body>
</html>