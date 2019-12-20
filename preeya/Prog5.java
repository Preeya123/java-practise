import java.util.*;
class Prog5
{
     public static void main(String[] args)
	 {
	  Scanner var=new Scanner(System.in);
	  System.out.println("Enter x");
	  int x=var.nextInt();
	  System.out.println("Enter y");
	  int y=var.nextInt();
	  System.out.println("Enter z");
	  int z=var.nextInt();
	  
  if(x<y && x<z)
  {
       System.out.println("L1 has the minimal seating capacity");
  }
  else if(y<x && y<z)
  {
       System.out.println("L2 has the minimal seating capacity");
  }
  else{
        System.out.println("L3 has the minimal seating capacity");
  }
	 
}
}