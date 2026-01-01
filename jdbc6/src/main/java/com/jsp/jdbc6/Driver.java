package com.jsp.jdbc6;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc1","postgres","root");
			
		    CallableStatement cst = con.prepareCall("call insert_student(104,'jetala',45)");
		    
		    cst.execute();
		    
		    System.out.println("inserted.......!");
		    
		    con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
