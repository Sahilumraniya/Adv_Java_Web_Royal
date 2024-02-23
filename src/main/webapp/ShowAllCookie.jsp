<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
	<thead>
		<tr>
			<th> Name </th>
			<th> Value </th>
		</tr>
	</thead>
	<%
		Cookie c[] = request.getCookies();
	
		for(Cookie x:c){
			out.print("<tr> <td> "+x.getName()+"</td><td>"+x.getValue()+"</td></tr>");
		}
	%>
	</table>
	<br>
	<a href="InputCookieData.jsp">Add Cookie</a>
</body>
</html>