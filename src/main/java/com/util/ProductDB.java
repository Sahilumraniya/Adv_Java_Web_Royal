package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import java.sql.ResultSetMetaData;

public class ProductDB {
	static Connection con;
	String driverName = "com.mysql.cj.jdbc.Driver";
	
	public ProductDB(String url,String username,String password) {
		try {
			Class.forName(this.driverName);
			Connection connection = DriverManager.getConnection(url,username,password);
			con = connection;
			System.out.println("Database Conneted :: "+con.toString());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int addProduct(String name,String category,Integer price,Integer qty) throws SQLException {
		PreparedStatement pstmt = con.prepareStatement("Insert into Products (name,category,price,qty) values (?,?,?,?)");
		pstmt.setString(1, name);
		pstmt.setString(2, category);
		pstmt.setInt(3, price);
		pstmt.setInt(4, qty);
		return pstmt.executeUpdate();
	}
	
	public ResultSet ShowAllProduct() throws SQLException {
		PreparedStatement pstmt = con.prepareStatement("select * from products");
		ResultSet rs = pstmt.executeQuery();
//		ResultSetMetaData rsMetaData = rs.getMetaData();
//        System.out.println("List of column names in the current table: ");
// 
//            // Retrieving the list of column names
//            int count = rsMetaData.getColumnCount();
// 
//            for (int i = 1; i<= count; i++) {
//                System.out.print(rsMetaData.getColumnName(i)+ "\t");
//            }
// 
		return rs;
	}
	
	public int deleteProduct(int ProductId) throws SQLException {
		PreparedStatement pstmt = con.prepareStatement("delete from products where productId = ?");
		pstmt.setInt(1, ProductId);
		return pstmt.executeUpdate();
	}
	
	public ResultSet getProduct(int productId) throws SQLException {
		PreparedStatement pstmt = con.prepareStatement("select * from products where productId = ?");
		pstmt.setInt(1, productId);
		return pstmt.executeQuery();
	}
}
