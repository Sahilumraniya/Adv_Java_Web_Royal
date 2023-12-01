package com.controller;

import java.io.PrintWriter;
import java.net.http.HttpRequest;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) {
		String email = req.getParameter("email");
		
		try {
			PrintWriter out = res.getWriter();
			res.setContentType("text/html");
			out.print(email+"<br>Thank You for Login");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Hey I am in Login Servlet");
	}
}
