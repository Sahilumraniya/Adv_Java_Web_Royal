<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
</head>
<body>
	<table border="1">
		<tbody>
			<tr>
				<th>Product Name </th>
				<th>Category</th>
				<th>Qty </th>
				<th>Price</th>
				<th>Action</th>
			</tr>
			<% 
				ResultSet rs = (ResultSet) request.getAttribute("rs");
				while(rs.next()){
					String name = rs.getString("name");
					String category = rs.getString("category");
					int price = rs.getInt("price");
					int qty = rs.getInt("qty");
					int id = rs.getInt("productId");
			%>
			<tr>
				<td><%=name %></td>
				<td><%=category %></td>
				<td><%=qty %></td>
				<td><%=price %></td>
				<td> <a href="DeleteProductServlet?productId=<%=id%>">delete</a> 
				<a href="ViewProductServlet?productId=<%=id%>">view</a>
				</td>
			</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>