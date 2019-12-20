
public class Account {
int number;
private String accountNumber = Integer.toString(number);
private int balance =0;
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public int getBalance() {
	return balance;
}
 public void deposit(int transactionAmount) {
	 if(balance==0)
	 {
		 System.out.println("Insufficient balance");
	 }else
	 {
		 this.balance=(balance+ transactionAmount);
		 System.out.println("Your balance after the transaction is:"+balance);
	 }
 }
 public void withdraw(int transactionAmount) {
	 if(balance < transactionAmount) {
		 System.out.println("Insuuficient balance");
	 }else
	 {
		 this.balance=(balance-transactionAmount);
		 System.out.println("Your balance after the transaction is:"+balance);
	 }
 }
}
