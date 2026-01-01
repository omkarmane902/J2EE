package com.jsp.jdbc5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {
	public static void main(String[] args) {
		
	try {
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc1", "postgres", "root");
		
		Statement st = con.createStatement();
		
		st.addBatch("insert into student values(103,'bapu',33)");
		
     	st.addBatch("insert into student values(101,'omkar',18)");
		
    	st.addBatch("delete from student where id = '103'");
		
		st.executeBatch();
		
		System.out.println("Execute all Query......");
		
		con.close();

	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
	
	}

}
