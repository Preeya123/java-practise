import java.util.*;

public class Mainclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the acc no");
		String acc = sc.nextLine();
		System.out.println("Enter the balance");
		int bal=Integer.parseInt(sc.nextLine());
		
		Account a = new Account();
		System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
		int opt=Integer.parseInt(sc.nextLine());
		
		switch(opt) {
		case 1:
			if(opt==1) {
				System.out.println("Enter thye amount to deposit");
				int amt = sc.nextInt();
				a.deposit(amt);
				break;
			}
		case 2:
				if(opt==2) {
				System.out.println("Enter thye amount to withdraw");
				int amt = sc.nextInt();
				a.withdraw(amt);
				break;
				}
		default:
		
			System.out.println("Sorry you have entered wrong number");
			break;
		}
			 
}
}
	