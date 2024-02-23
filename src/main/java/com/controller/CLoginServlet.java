package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CLoginServlet
 */
public class CLoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(email.equals("rock@gmail.com") && password.equals("rock123")) {
			Cookie c = new Cookie("Login", "true");
			response.addCookie(c);
			request.getRequestDispatcher("CHome.jsp").forward(request, response);
		}else {
			request.setAttribute("error", "Invaild credential");
			request.getRequestDispatcher("CLogin.jsp").forward(request, response);
		}
	}

}
