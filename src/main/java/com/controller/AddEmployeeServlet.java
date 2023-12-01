package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		//read data from from
		String firstname = req.getParameter("firstname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String hobby[] = req.getParameterValues("hobby");
		String city = req.getParameter("city");
		String address = req.getParameter("address");
		
		try {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.print("<html><body>");
			out.print("First Name : "+firstname);
			out.print("<br>Email : "+email);
			out.print("<br>Password : "+password);
			out.print("<br>Gender : "+gender);
			out.print("<br>Hobby : ");
			for (String h : hobby) {
				out.print(h+" ");
			}
			out.print("<br>City : "+city);
			out.print("<br>Address : "+address);
			out.print("</body></html>");
		}catch(Exception e) {
			System.out.println("AddEmployeeServlet::Error");
		}
	}
}