import java.util.*;
class RedCross
{
    public static void main(String[] args)
	{
	   Scanner var = new Scanner(System.in);
	   int n = var.nextInt();
	   int num[] =new int[n];
	   for(int i=0;i<n;i++)
	   {
	      num[i] = var.nextInt();
	   }
	   int sum=0;
	   for(int i=0;i<n;i++)
	   {
	      sum= sum+num[i];
	   }
        System.out.println(sum);
	   
	}
}