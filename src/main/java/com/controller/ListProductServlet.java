package com.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.util.ProductDB;

@WebServlet("/ListProductServlet")
public class ListProductServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {			
			ProductDB db = new ProductDB("jdbc:mysql://localhost:3306/royalavdjava", "root", "root");
			ResultSet rs = db.ShowAllProduct();
			req.setAttribute("rs", rs);
			//System.out.println(rs.getArray(1));
			RequestDispatcher rd = req.getRequestDispatcher("ListProduct.jsp");
			rd.forward(req, resp);
		}catch (Exception e) {
			System.out.println("Somting went worng"); 
		}
	}
}
