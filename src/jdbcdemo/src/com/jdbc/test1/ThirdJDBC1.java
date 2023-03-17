//inserting values in table by using BufferedReader......
package com.jdbc.test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ThirdJDBC1 {

	public static void main(String[] args) {
		try {
			//load the Driver.....
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the Connection......
			String url="jdbc:mysql://localhost:3306/test";
			String userName="root";
			String password="9984";
			Connection con=DriverManager.getConnection(url, userName, password);
			
			String q="insert into table1(tName, tCity) values(?, ?)";//Dynamic or parameterized query
			
			PreparedStatement pstmt=con.prepareStatement(q);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the name: ");
			String name=br.readLine();
			
			System.out.println("Enter the city: ");
			String city=br.readLine();
			
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			
			pstmt.executeUpdate();
			
			System.out.println("Inserted Successfully.....");
			con.close();
			
			/*
			 * String q="drop table table2"; Statement stmt=con.createStatement();
			 * stmt.executeUpdate(q); System.out.println("Done"); con.close();
			 */
			
			/*
			 * if(con.isClosed()) { System.out.println("Connection is Closed"); } else {
			 * System.out.println("Connection is Done"); }
			 */
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
