import java.util.*;
class Prog12
{
     public static void main(String[] args)
	 {
	   String[] days={"Sat","Sun","Mon","Tue","Wed","Thur","Fri"};
	   Scanner var = new Scanner(System.in);
	   System.out.println("Enter the day number");
	   int x= Integer.parseInt(var.nextLine());
	   String[] day = new String[7];
	   day[0]="Sat";
	   day[1]="Sun";
	   day[2]="Mon";
	   day[3]="Tue";
	   day[4]="Wed";
	   day[5]="Thur";
	   day[6]="Fri";
	   System.out.println("Day of the week is" +day[x]);
	   
	 }
}