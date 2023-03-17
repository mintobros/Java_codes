//insert values into table.....
package com.jdbc.test1;

import java.sql.*;
import java.io.*;

public class SecondJDBC1 {

	public static void main(String[] args) {
		
		try {
			//load the Driver.....
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create the Connection.....
			String url="jdbc:mysql://localhost:3306/test";
			String userName="root";
			String password="9984";
			Connection con=DriverManager.getConnection(url, userName, password);
			//create the query.....
			String q="insert into table1(tName, tCity) values(?, ?)";//Dynamic or parameterized query
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1, "Kajal");
			pstmt.setString(2, "Mumbai");
			pstmt.executeUpdate();
			System.out.println("Inserted");
			con.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}

}
