package jdbc1;

import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		

		while(true)
		{
			product p = new product();
			System.out.println("If you want to insert product value then click on 1");
			System.out.println("If you want to update product value then click on 2");
			System.out.println("If you want to delect product then click on 3");
			System.out.println("If you want to find product then click on '4' and enter id " );
			System.out.println("If you want to find product then click on '5' and enter price");
			System.out.println("If you want to find product then click on '6' and enter name");
			System.out.println("7. Exit");
			System.out.print("Enter the Number : ");
			Scanner sc = new Scanner(System.in);
		    int value = sc.nextInt();
			switch (value) {
			case 1:
				p.insertProduct();
				break;
				
			case 2:
				p.updateProductPrice();
				break;
			case 3:
				p.deleteProduct();
				break;
			case 4:
				p.findById();
				break;
			case 5:
				p.findByPrice();
				break;
			case 6:
				p.findAll();
				break;
			case 7:
				 System.out.println("Exit...");
		            return; 

			default:
				System.out.println("something is wrong!");
				System.out.println("please try again!");
			}
			
		}		
		
	}
}
