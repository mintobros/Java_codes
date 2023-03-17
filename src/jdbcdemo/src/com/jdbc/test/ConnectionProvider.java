package com.jdbc.test;

import java.sql.Connection;


import java.sql.DriverManager;

public class ConnectionProvider {
	private static Connection con;
	public static Connection getConnection() {
		
		try {
		if(con == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/test";
			String userName="root";
			String password="9984";
			con = DriverManager.getConnection(url, userName, password);
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
