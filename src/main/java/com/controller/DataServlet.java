package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataServlet")
public class DataServlet extends HttpServlet{
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException , ServletException{
		String fname = request.getParameter("fname");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		
		request.setAttribute("firstName", fname);
		request.setAttribute("dob", dob);
		request.setAttribute("gender", gender);
		
		RequestDispatcher rd = request.getRequestDispatcher("OutData.jsp");
		rd.forward(request, response);
	}
	

}
