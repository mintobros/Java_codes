package com.jdbc.test1;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider1 {
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			if(con==null) {
			//load the Driver.....
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the Connection.....
			String url="jdbc:mysql://localhost:3306/test";
			String userName="root";
			String password="9984";
			Connection con=DriverManager.getConnection(url, userName, password);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
