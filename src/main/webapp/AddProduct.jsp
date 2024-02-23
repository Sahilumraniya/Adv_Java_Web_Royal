<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
</head>
<body>
	<form action="SaveProductServlet" method="post">
		Name : <input type="text" name="name"/><br><Br>  
		Price :<input type="text" name="price"/><Br><br> 
		Category : <input type="text" name="category"/><br><Br> 
		Qty : <input type="text" name="qty"/><br><br> 

		<input type="submit" value="Save Product"/>

	</form>
</body>
</html>