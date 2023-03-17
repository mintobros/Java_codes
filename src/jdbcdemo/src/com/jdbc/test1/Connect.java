package com.jdbc.test1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

	public static void main(String[] args) {
		try {
		//load the driver.....
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/test";
		String userName="root";
		String password="9984";
		Connection con=DriverManager.getConnection(url, userName, password);
		
		if(con.isClosed()) {
			System.out.println("Connection is closed");
		}else {
			System.out.println("Connected");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
