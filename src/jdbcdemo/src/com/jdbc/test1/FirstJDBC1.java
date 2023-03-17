package com.jdbc.test1;

import java.sql.*;

import java.io.*;

public class FirstJDBC1{
	public static void main(String[] args) {
		try {
			//load the Driver......
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the Connection......
			String url="jdbc:mysql://localhost:3306/test";
			String userName="root";
			String password="9984";
			Connection con=DriverManager.getConnection(url, userName, password);
			
			//create the query.....
			String q="create table table6(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
			
			//create the statement.....
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table created");
			con.close();
			
			/*
			 * if(con.isClosed()) { System.out.println("Connection is Closed"); } else {
			 * System.out.println("Connected"); }
			 */
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}