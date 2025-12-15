package Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class statement1 {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp" ,"postgres","root");
			
			Statement st = con.createStatement();
			
		   boolean b =st.execute("update student set name = 'avi bro ");
		   
		   System.out.println(b);
		           
		   con.close();
		   
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
