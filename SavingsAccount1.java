public class SavingsAccount1 {
  
  int balance;
  
  public SavingsAccount1(int initialBalance){
    balance = initialBalance;
  }
     public void checkBalance(){
       System.out.println("Hello!");
       System.out.println("Your balance is "+ balance );
    }
    public void deposit(int amountToDeposit){
     balance = amountToDeposit + balance;
      System.out.println("You just deposited amountToDeposit " + amountToDeposit);
    }
    public int withdraw(int amountToWithdraw){
      balance = balance - amountToWithdraw;
       System.out.println("You just withdrew amountToWithdraw " + amountToWithdraw);
    return amountToWithdraw;
    }
public String toString(){
  return "This is a savings account with " + balance + " saved.";
}

  public static void main(String[] args){
    SavingsAccount1 savings = new SavingsAccount1(2000);
 
    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
   savings.withdraw(300);
    
    //Check balance:
    savings.checkBalance();
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(300);
    //Check balance:
    savings.checkBalance();
    System.out.println(savings);
    
  }       
}