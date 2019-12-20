import java.util.*;
class Prog10
{
     public static void main(String[] args)
	 {
	   String[] days = {"Satr", "Sun", "Mon", "Tue", "Wed", "Thur", "Fri"};
	   Scanner var = new Scanner(System.in);
	   System.out.println("Enter the Day Number");
	   int i=var.nextInt();
	   System.out.println(days[i]);
	 }
}