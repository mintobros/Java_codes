package com.jdbc.test;

import java.sql.*;

import java.io.*;
public class SecondJDBC {

	public static void main(String[] args) {
		try {
		//install the Driver....
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create the Connection.....
		String url="jdbc:mysql://localhost:3306/test";
		String userName="root";
		String password="9984";
		Connection con=DriverManager.getConnection(url, userName, password);
		
		//check if connection is closed....
		/*
		 * if(con.isClosed()) { System.out.println("Connection is closed"); } else {
		 * System.out.println("Connection is ready"); }
		 */
		
		//create a query....
		String q="insert into table1(tName, tCity) values(?, ?)";//dynamic query or parameterized query 
		//bcoz values are unknown.
		
		//PreparedStatement is an interface which has prepareStatement() used to pass 
		//dynamic query(where values are not known) into table created.
		
		//get the PreparedStatement object
		PreparedStatement pstmt=con.prepareStatement(q);
		
		//set values to the query....
		pstmt.setString(1, "Jawed Abbas");
		pstmt.setString(2, "Lahore");
		pstmt.executeUpdate();
		
		System.out.println("inserted");
		
		con.close();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
