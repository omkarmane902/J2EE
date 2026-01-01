package com.jsp.jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc1", "postgres", "root");
			
			PreparedStatement pst = con.prepareStatement("update student set name = 'chinmay' where id = '101'");
			
			int executeUpdate = pst.executeUpdate();
			
			System.out.println(executeUpdate);
			
			con.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
