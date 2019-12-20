import java.util.*;
class Prog3{
             public static void main(String args[])
			 {
			    Scanner sc = new Scanner(System.in); 
				System.out.println("Enter number of dozens of toys purchased");
				int x = sc.nextInt();
				System.out.println("Enter the selling price of 1 toy");
				int y = sc.nextInt();
				System.out.println("Enter the selling price of 1 toy");
				int z = sc.nextInt();
			
                double cp = y/12;
				double profit = z - cp;
                profit = profit/cp * 100;
				
					System.out.println("Sam's profit percentage is "+profit+"percent");
			 }
}