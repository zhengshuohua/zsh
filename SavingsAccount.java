public class SavingsAccount{
	int balance;
	public SavingsAccount(int initialBalance) {
		balance = initialBalance;
	}
	public static void main(String[]args) {
		SavingsAccount savings = new SavingsAccount(5000);
		
	
		
		//check balance
		System.out.println("Hello!");
		 System.out.println("Your balance is "+savings.balance);
		//Withdrawing:
		int afterWithdraw = savings.balance - 3000;
		savings.balance = afterWithdraw;
		System.out.println("You just withdrew "+3000);
		System.out.println("Hello!");
		System.out.println("You balance is "+savings.balance);
		
		int afterDeposit = savings.balance + 2455;
		savings.balance = afterDeposit;
		System.out.println("You just deposited "+ 2455);
		
		System.out.println("Hello!");
		System.out.println("Your balance is "+savings.balance);
		
		int afterDeposit2 = savings.balance + 601 ;
		savings.balance = afterDeposit2;
		System.out.println("You just deposited "+601);
		
		System.out.println("Hello!");
	    System.out.println("Your balance is "+savings.balance);
		
		
		
	}
}