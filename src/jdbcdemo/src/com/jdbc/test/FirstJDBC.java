package com.jdbc.test;

import java.sql.*;



import java.io.*;
class FirstJDBC{
	public static void main(String[] args){
		try{
			//load the driver:
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating a connection....
			String url="jdbc:mysql://localhost:3306/test";
			String username="root";
			String password="9984";
			Connection con=DriverManager.getConnection(url,username,password);
			
			//Create a query....
			String q="create table table4(tId int(20) primary key auto_increment,tName varchar(200) not null, tCity varchar(400))";
			
			//Create a statement....
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table created");
			con.close();
			
			/*
			 * if(con.isClosed()){ System.out.println("Connection is Closed"); } else{
			 * System.out.println("Connection Created"); }
			 */
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}