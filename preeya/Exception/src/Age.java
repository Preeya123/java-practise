import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Age ::");
	int age=sc.nextInt();
    
	try {
		if(age<18)
		  throw new AgeExcetion();
		else
		  System.out.println("Welcome to vote");
	}
	catch(AgeExcetion a)
	{
		System.out.println(a);
	}
	}

}
