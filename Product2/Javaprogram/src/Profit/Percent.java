package Profit;
import java.util.*;
public class Percent {

	public static void main(String[] args) {
	Show s=new Show();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of dozens of toys purchased :");
    int dozenCount = sc.nextInt();
    System.out.println("Enter the rate per dozen :");
    int pricePerDozen = sc.nextInt();
    System.out.println("Enter the selling price per toy: ");
    int sellPrice = sc.nextInt();
    float percentage = s.calculateProfit(dozenCount,pricePerDozen,sellPrice);
    System.out.printf("Sam's profit percentage is %.2f\n ",percentage);
    }

}
