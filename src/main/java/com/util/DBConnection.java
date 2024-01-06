package com.util;

import java.sql.*;
import java.util.Scanner;

public class DBConnection {
	static Connection con;
	public DBConnection(String url,String username,String password) {
		String driverName = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("DBConnection");
//			System.out.println(con);
			con = conn;
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int addRow(String fname,String email,String password) throws SQLException {
		PreparedStatement prs = con.prepareStatement("insert into royalavdjava.user (firstName,email,password) values (?,?,?);");
		prs.setString(1, fname);
		prs.setString(2, email);
		prs.setString(3, password);
		
		return prs.executeUpdate();
	}
	
	public void getAllUser() throws SQLException {
		PreparedStatement psmt = con.prepareStatement("select * from user");
		ResultSet rs = psmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("userId")+"\t"+rs.getString("firstName")+"\t"+rs.getString("email")+"\t"+rs.getString("password"));
		}
	}
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/royalavdjava";
		String username = "root";
		String password = "root";
		DBConnection db = new DBConnection(url, username, password);
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name : ");
		String fname = sc.next();
		System.out.println("Enter email : ");
		String email = sc.next();
		System.out.println("Enter password : ");
		String pass = sc.next();
		*/
		try {
//			db.addRow(fname, email, pass);
			db.getAllUser();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
