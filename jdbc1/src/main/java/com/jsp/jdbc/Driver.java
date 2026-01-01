package com.jsp.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {
	
 public static void main(String[] args) {
	
	 
	 try {
		Class.forName("org.postgresql.Driver");
		Connection  con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc1","postgres", "root");
		
		Statement stm = con.createStatement();
		
		    boolean execute = stm.execute("insert into student values(101,'omkar',18)");
		    
		    System.out.println(execute);
		    
		    con.close();

		
	 } catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	 }
}

}
