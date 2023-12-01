package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistartionServlet")
public class RegistartionServlet extends HttpServlet{
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException ,ServletException{
		//read all data
		String fname = request.getParameter("fname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Boolean isVaild = true;
		RegistartionError e = new RegistartionError();
		if(fname.trim()=="") {
			isVaild=false;
			e.setFname("Enter first name");
		}
		if(email.trim()=="") {
			isVaild=false;
			e.setEmail("Enter email");
		}
		if(password.trim()=="") {
			isVaild=false;
			e.setPassword("Enter Password");
		}
		RequestDispatcher rd;
		if(!isVaild) {
			request.setAttribute("error", e);
			rd = request.getRequestDispatcher("Registration.jsp");
			
		}else {
			RegistrationData data = new RegistrationData(fname,email,password);
			request.setAttribute("data", data);
			rd = request.getRequestDispatcher("Home.jsp");
		}
		rd.forward(request, response);
	}
	

}
