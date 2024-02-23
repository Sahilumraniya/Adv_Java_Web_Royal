package com.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.ProductDB;

@WebServlet("/ViewProductServlet")
public class ViewProductServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int productId = Integer.parseInt(req.getParameter("productId"));
		
		try {
			ProductDB db = new ProductDB("jdbc:mysql://localhost:3306/royalavdjava", "root", "root");
			ResultSet rs = db.getProduct(productId);
			req.setAttribute("rs", rs);
			req.getRequestDispatcher("ProductInfo.jsp").forward(req, res);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went worng");
		}
	}
}
