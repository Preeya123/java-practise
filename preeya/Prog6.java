import java.util.*;
class Prog6
{
	public static void main(String[] args)
	{
		Scanner var = new Scanner(System.in);
		System.out.println("Enter the first number");
		int x = var.nextInt();
		System.out.println("Enter the second number");
		int y = var.nextInt();
		
	if(x>y)
	{
		System.out.println(x+" is greater than"+y);
	}
	else if(x<y)
	{
		System.out.println(x+"is less than"+y);
	}
	else
	{
		System.out.println(y+"is equal to"+x);
	}
	}
}