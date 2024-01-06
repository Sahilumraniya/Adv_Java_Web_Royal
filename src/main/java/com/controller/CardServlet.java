package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CardServlet")
public class CardServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String a = req.getParameter("a");
		String b = req.getParameter("b");
		String Status;
		String winner;
		
		Status = "A : "+a+"\tB : "+b;
		
		if(Integer.parseInt(a) > Integer.parseInt(b)) {
			winner = "A is Winner";
		}else if(Integer.parseInt(b) > Integer.parseInt(a)) {
			winner = "B is Winner";
		}else {
			winner = "match is draw";
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("BattleResult.jsp");
		
		req.setAttribute("winner", winner);
		req.setAttribute("status", Status);
		rd.forward(req, res);
	}
}
