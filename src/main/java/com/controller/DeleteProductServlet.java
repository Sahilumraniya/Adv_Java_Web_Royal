package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.ProductDB;

@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(req.getParameter("productId"));
		System.out.println("product id : "+id);
		try {
			ProductDB db = new ProductDB("jdbc:mysql://localhost:3306/royalavdjava", "root", "root");
			int record=db.deleteProduct(id);
			if (record == 0) {
				System.out.println("SMW");
			} else {
				System.out.println(record + " record deleted");
			}
			System.out.println("product id is deleted");
			RequestDispatcher rd = req.getRequestDispatcher("ListProductServlet");
			rd.forward(req, res);
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}
