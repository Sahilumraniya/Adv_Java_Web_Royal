package com.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestHeader
 */
public class RequestHeader extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Enumeration<String> requestHeader = req.getHeaderNames();
		
		req.setAttribute("requestHeader", requestHeader);
		req.getRequestDispatcher("Header.jsp").forward(req, res);
	}
}
