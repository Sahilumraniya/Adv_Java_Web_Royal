package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.ProductDB;

@WebServlet("/SaveProductServlet")
public class SaveProductServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String category = req.getParameter("category");
		Integer price = Integer.parseInt(req.getParameter("price"));
		Integer qty = Integer.parseInt(req.getParameter("qty"));
		
		try {
			ProductDB db = new ProductDB("jdbc:mysql://localhost:3306/royalavdjava", "root", "root");
			int result = db.addProduct(name, category, price, qty);
			if (result == 0) {
				System.out.println("SMW");
			} else {
				System.out.println("product Added");
			}

			RequestDispatcher rd = req.getRequestDispatcher("AddProduct.jsp");
			rd.forward(req, res);
		}catch (Exception e) {
			System.out.println("Somting went worng");
		}
	}
}
