<%@page import="com.controller.RegistrationError"%>
<%@page import="com.controller.RegistrationData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
</head>
<body>

<form action="RegistrationServlet" method="post">
    <label for="fname">First Name: </label>
    <input type="text" id="fname" name="fname" value="${data.fname}">
    <span style="color: red">${error.fname}</span>
    <br><br>
    <label for="email">Email: </label>
    <input type="email" id="email" name="email" value="${data.email}">
    <span style="color: red">${error.email}</span>
    <br><br>
    <label for="password">Password: </label>
    <input type="password" id="password" name="password" value="${data.password}">
    <span style="color: red">${error.password}</span>
    <br><br>
    <label>Gender:</label>
    <input type="radio" name="gender" value="male" ${data.gender eq 'male' ? 'checked' : ''} id="male"> <label for="male"> Male </label>
    <input type="radio" name="gender" value="female" ${data.gender eq 'female' ? 'checked' : ''} id="female"> <label for="female"> Female </label>
    <span style="color: red">${error.gender}</span>
    <br><br>
    <label for="city">City:</label>
    <select name="city" id="city">
        <option value="None">--- Select City ---</option>
        <option value="ahmedabad" ${data.city eq 'ahmedabad' ? 'selected' : ''}>Ahmedabad</option>
        <option value="baroda" ${data.city eq 'baroda' ? 'selected' : ''}>Baroda</option>
        <option value="surat" ${data.city eq 'surat' ? 'selected' : ''}>Surat</option>
        <option value="delhi" ${data.city eq 'delhi' ? 'selected' : ''}>Delhi</option>
    </select>
    <span style="color: red">${error.city}</span>
    <br><br>
    <label for="aboutMe">About Yourself: </label>
    <textarea rows="6" cols="25" name="aboutMe" id="aboutMe">${data.aboutMe}</textarea>
    <span style="color: red">${error.aboutMe}</span>
    <br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
