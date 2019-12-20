import java.util.*;
class Prog9
{
   public static void main(String[] args)
   {
      Scanner var = new Scanner(System.in);
	  System.out.println("Enter the content of the document");
	  String str = var.nextLine();
	  System.out.println("Enter the old name of the company");
	  String str1=var.nextLine();
	  System.out.println("Enter the new name of the company");
	  String str2=var.nextLine();
	  String str3 = str.replace(str1,str2);
	  System.out.println(str3);
   }
}