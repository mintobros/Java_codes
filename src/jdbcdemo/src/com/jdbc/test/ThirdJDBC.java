//inserting values in table by using BufferedReader.....
package com.jdbc.test;

import java.sql.*;

import java.io.*;
public class ThirdJDBC {

	public static void main(String[] args) {
		try {
			//load the Driver....
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the Connection....
			String url="jdbc:mysql://localhost:3306/test";
			String userName="root";
			String password="9984";
			Connection con=DriverManager.getConnection(url, userName, password);
			
			//create a query....
			String q="insert into table1(tName, tCity) values(?, ?)";
			
			//get the PreparedStatement object
			PreparedStatement pstmt=con.prepareStatement(q);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name: ");
			String name=br.readLine();
			
			System.out.println("Enter city: ");
			String city=br.readLine();
			
			//set the values to query....
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			
			pstmt.executeUpdate();
			
			System.out.println("Inserted");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
