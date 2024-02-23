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
		Cookie c[] = request.getCookies();
		
			for(Cookie x:c){
				if(x.getName().equals("Login")){
					response.sendRedirect("CHome.jsp");
				}
			}
		
	%>

	<form method="post" action="CLoginServlet">
		Email : <input type="email" name="email"> <br> <br>
		Password : <input type="password" name="password"> <br> <br>
		<br>
		<input type="submit" value="Login">
	</form> 
	<h3 style="color:red">${error }</h3>
</body>
</html>