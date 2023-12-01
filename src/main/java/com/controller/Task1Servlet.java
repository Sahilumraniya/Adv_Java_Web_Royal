package com.controller;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task1Servlet")
public class Task1Servlet extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) {
		
		String x = req.getParameter("n1");
		String y = req.getParameter("n2");
		String op = req.getParameter("op");
		String error = "Please fill inputs";
		try {
			PrintWriter out = res.getWriter();
			res.setContentType("text/html");
			
			boolean isVaildate = true;
			
			if(x==null || x=="") {
				isVaildate = false;
				error = "Please enter num1";
			}
			if(y==null || y=="") {
				isVaildate = false;
				error = "Please enter num2";
			}
			if(op==null || y=="") {
				isVaildate = false;
				error = "Please choise oprations";
			}
			
			if(!isVaildate) {
				out.print("<p style=\"color: red;\">"+error+"</p>");
			}
			
			int n1 = Integer.parseInt(x.trim());
			int n2 = Integer.parseInt(y.trim());
			int n3;
			//System.out.println("Opration : "+op);
			
		
		
			if(op.equals("Add")) {
				n3=n1+n2;
				out.print("<p style=\"color: green;\">"+n1+" + "+n2+" = "+n3+"</p>");
			}else if(op.equals("Sub")) {
				n3=n1-n2;
				out.print("<p style=\"color: green;\">"+n1+" - "+n2+" = "+n3+"</p>");
			}else if(op.equals("Mul")) {
				n3=n1*n2;
				out.print("<p style=\"color: green;\">"+n1+" * "+n2+" = "+n3+"</p>");
			}else if(op.equals("Div")) {
				n3=n1/n2;
				out.print("<p style=\"color: green;\">"+n1+" / "+n2+" = "+n3+"</p>");
			}else {
				out.print("Invild Opration");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
