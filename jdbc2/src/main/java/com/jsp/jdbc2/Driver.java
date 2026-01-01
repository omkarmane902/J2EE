package com.jsp.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Driver {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc1", "postgres", "root");
			
			PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");
			
			pst.setInt(1, 102);
			
			pst.setString(2, "abhi");
			
			pst.setInt(3, 22);
			
			
             int executeUpdate = pst.executeUpdate();
             
             System.out.println(executeUpdate);
             
             con.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
