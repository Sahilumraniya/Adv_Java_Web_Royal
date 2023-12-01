package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SingupServlet")
public class SingupServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) {
		String fname = request.getParameter("fname");
		
		try {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.print("Welcome "+fname);
			out.print("<br>Thank You for Sinup");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Hey I am in Singup Servlet");
	}
}