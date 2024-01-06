package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String UpperCaseName = req.getParameter("name").toUpperCase();
		
		req.setAttribute("un", UpperCaseName);
		
		RequestDispatcher rd = req.getRequestDispatcher("NameUpper.jsp");
		rd.forward(req, res);
	}
}
