package Javaprogram;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		
           Scanner sc = new Scanner(System.in);
    	   ProductDetails pd = new ProductDetails();
    
           System.out.println("Enter the product id");
           long id = Integer.parseInt(sc.nextLine());
           pd.setId(id);
           
           System.out.println("Enter the product name");
           pd.pname=sc.nextLine();
           String name1=pd.pname;
           
           System.out.println("Enter the Supplier name");
           pd.sname=sc.nextLine();
           String p1=pd.sname;
           
           System.out.println("Product Id is"+id);
           System.out.println("Product Name is"+name1);
           System.out.println("Supplier Name is" +p1);

	}

}
