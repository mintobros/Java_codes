package com.jdbc.test;

import java.sql.*;

import java.io.*;
public class ImageSave {

	public static void main(String[] args) {
		try {
			//load the driver....
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection....
			String url="jdbc:mysql://localhost:3306/test";
			String userName="root";
			String password="9984";
			Connection con=DriverManager.getConnection(url, userName, password);
			
			/*
			 * if(con.isClosed()) { System.out.println("Connection is closed"); } else {
			 * System.out.println("Connected"); }
			 */
			
			String q="insert into images(pic) values(?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			
			FileInputStream fis=new FileInputStream("D:\\C tutorials\\img/c.png");
			
			pstmt.setBinaryStream(1, fis, fis.available());
			
			pstmt.executeUpdate();
			System.out.println("done");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
