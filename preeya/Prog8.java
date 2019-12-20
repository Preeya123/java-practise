import java.util.*;
class Prog8
{
  public static void main(String[] args)
  {
     Scanner var=new Scanner(System.in);
	 System.out.println("Enter the string");
	 String str=var.nextLine();
	 System.out.println("Enter the stating string");
	 String strl = var.nextLine();
	 if(str.startsWith(strl))
	 {
	   System.out.println(str+ "start with https");
	 }
	 else
	 {
	    System.out.println(var+ "does start with htps");
	 }
  }
}