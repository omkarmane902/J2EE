package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {

	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("org.postgresql.driver");
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","root");
			
			//Statement stm =con.createStatement();
			//Statement stm = con.prepareStatement(null);      // we can pass delemetr
			//Statement  stm = con.prepareCall(null);
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
