package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class product {

	
	 	static String url = "jdbc:postgresql://localhost:5432/qsp";
	    static	String user = "postgres";
	    static	String password = "root";
	    static Connection con;
	    
	    
	    Scanner sc = new Scanner(System.in);
	    
	    
	    static {
	    	
	    	try {
				Class.forName("org.postgresql.Driver");
				
				con = DriverManager.getConnection(url,user,password);
				
			} catch (ClassNotFoundException |SQLException e) {
				
				e.printStackTrace();
			}
	    }
	    
	    
	    public  void insertProduct() {
	    	
	    	try {
				PreparedStatement ptm = con.prepareStatement("insert into product values(?,?,?)");
				
				System.out.print("Enter coloum Id :");
				int coloumid = sc.nextInt();
				ptm.setInt(1, coloumid);
				
				sc.nextLine();
				System.out.print("Enter Product Name :");
				String name = sc.nextLine();
				ptm.setString(2, name);
				 
				System.out.print("Enter product price ₹ : ");
				Double price = sc.nextDouble();
				ptm.setDouble(3, price);
				
			    ptm.execute();
			System.out.println("value is inserted successfully!");
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	    }
	    
	    
	    public void updateProductPrice()
	    {
	    	try {
				PreparedStatement ptm = con.prepareStatement("update product set price = ? where id = ?");
				
				System.out.print("Enter Updated price ₹  Id :");
				double price = sc.nextDouble();
				ptm.setDouble(1, price);
				
				System.out.print("Enter coloum Id :");
				int coloumid = sc.nextInt();
				ptm.setInt(2, coloumid);
				
			    ptm.execute();
			    System.out.println("value is Updated successfully!");
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	    }
	    
	    public void deleteProduct()
	    {
	    	try {
				PreparedStatement pst = con.prepareStatement("delete from product where id = ?");
				System.out.print("Enter your Deleted Row id :  ");
				int id = sc.nextInt();
				pst.setInt(1, id);
				
				pst.execute();
				
				System.out.println("value is Deleted successfully!");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	    }
	    
	    
	   public void findById()
	   {
		   try {
			PreparedStatement pst = con.prepareStatement("select * from product where id = ?");
			
			System.out.print("Enter your Find Product id :  ");
			int id = sc.nextInt();
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				System.out.println("id is : " + rs.getInt("id"));
				System.out.println("Product name is : " + rs.getString("name"));
				System.out.println("Product value is : " + rs.getDouble("₹"+"price"));
			}
			
		   } catch (SQLException e) {
			
			e.printStackTrace();
		   } 
	   }
	   
	   public void findByPrice() {
		   
		   try {
			PreparedStatement pst = con.prepareStatement("select * from product where price = ?");
			
			System.out.print("Enter your Find Product Price ₹ :");
			double price = sc.nextDouble();
			pst.setDouble(1, price);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{

				System.out.println("id is : " + rs.getInt("id"));
				System.out.println("Product name is : " + rs.getString("name"));
				System.out.println("Product value is : " + rs.getDouble("₹"+"price"));
			}
		   } catch (SQLException e) {
			
			e.printStackTrace();
		   }
		   
	   }
	   
	   public void findAll()
	   {
		   try {
			PreparedStatement pst = con.prepareStatement("select * from product where name = ? ");
			
			
			System.out.print("Enter your Find Product Name :");
			String name = sc.nextLine();
			pst.setString(1, name);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				System.out.println("id is : " + rs.getInt("id"));
				System.out.println("Product name is : " + rs.getString("name"));
				System.out.println("Product value is : " + rs.getDouble("₹"+"price"));
			}
			
		   } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
	   }
	
	
}
