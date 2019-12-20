import java.util.*;
class Prog4{
             public static void main(String args[])
			 {
			    Scanner sc = new Scanner(System.in); 
				System.out.println("Enter price of Item 1");
				double x = sc.nextDouble();
				System.out.println("Enter price of Item");
				double y = sc.nextDouble();
				System.out.println("Enter discount in percentage");
				double z = sc.nextDouble();
			
                double total = x+y;
				System.out.printf("Total amount :$%.2f\n",total);
				double price= total/z;
				double percentage = total - price;
				System.out.printf("Discounted amount :$%.2f\n",percentage);
				System.out.printf("Saved amount:$%.2f\n",price);
			 }
}