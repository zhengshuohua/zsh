public class BankAccount{
	public static void main(String[]args) {
		double balace=999.99;
		double amountToWitchdraw=333;
	
		double amountForEachFriend=(balace-amountToWitchdraw)/3;
		boolean canPurchaseTicket=amountForEachFriend>=333;
		System.out.println(canPurchaseTicket);
		System.out.println("I gave each friend"+amountForEachFriend+"...");
		System.out.println(8 <= 8);
	}
}