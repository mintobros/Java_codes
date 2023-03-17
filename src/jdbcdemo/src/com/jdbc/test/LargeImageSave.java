package com.jdbc.test;

import java.io.File;




import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class LargeImageSave {

	public static void main(String[] args) {
		try {
			Connection c=ConnectionProvider.getConnection();
			
			String q="insert into images(pic) values(?)";
			
			PreparedStatement pstmt=c.prepareStatement(q);
			
			JFileChooser jfc=new JFileChooser();
			
			jfc.showOpenDialog(null);
			
			File file = jfc.getSelectedFile();
			
			FileInputStream fis = new FileInputStream(file);
			
			pstmt.setBinaryStream(1, fis, fis.available());
			
			pstmt.executeUpdate();
			
			System.out.println("Done");
			
			//if we want to put data in gui format....
			JOptionPane.showMessageDialog(null, "Success");
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
