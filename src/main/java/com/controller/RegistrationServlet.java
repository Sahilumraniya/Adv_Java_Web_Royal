package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet{
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException ,ServletException{
		//read all data
		String fname = request.getParameter("fname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String aboutMe = request.getParameter("aboutMe");
		
		Boolean isVaild = true;
		RegistrationError e = new RegistrationError();
		
		String alpha = "[a-zA-z]+";
		String emailRegEx = "[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]{2,5}";
		
		if(fname==null ||fname.trim()=="") {
			isVaild=false;
			e.setFname("Enter first name");
		}else if(fname.matches(alpha)==false) {
			isVaild=false;
			e.setFname("Enter first vaild name");
		}
		if(email==null || email.trim()=="") {
			isVaild=false;
			e.setEmail("Enter email");
		}else if(email.matches(emailRegEx)) {
			isVaild=false;
			e.setEmail("Enter vaild Email");
		}
		if(password==null || password.trim()=="") {
			isVaild=false;
			e.setPassword("Enter Password");
		}
		if(gender==null) {
			isVaild=false;
			e.setGender("Enter Gender");
		}
		if(city==null || city.equals("None")) {
			isVaild=false;
			e.setCity("Please select City");
		}
//		System.out.println(aboutMe);
		if(aboutMe==null || aboutMe.trim()=="") {
			isVaild=false;
			e.setAboutMe("Please somethong about your self");
		}
		RegistrationData data=new RegistrationData(fname, email, password, gender, city, aboutMe);
		RequestDispatcher rd;
		if(!isVaild) {
			request.setAttribute("error", e);
			request.setAttribute("data", data);
			rd = request.getRequestDispatcher("Registration.jsp");
			
		}else {
			request.setAttribute("data", data);
			System.out.println(data.getGender());
			rd = request.getRequestDispatcher("Home.jsp");
		}
		rd.forward(request, response);
	}
	

}
