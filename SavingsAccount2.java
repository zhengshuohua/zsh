public class SavingsAccount2{

  public String owner;
  public int balanceDollar;
  public double balanceEuro;

  public SavingsAccount2(String owner, int balanceDollar){
    // Complete the constructor
	  this.owner = owner;
	  this.balanceDollar = balanceDollar ;
	  this.balanceEuro = balanceDollar * 0.85;
  }

  public void addMoney(int balanceDollar){
	  this.balanceDollar += balanceDollar;
	  System.out.println("Adding "+balanceDollar+" to the account.");
	  System.out.println("The new balance is "+this.balanceDollar+" dollars.");
	  
    // Complete this method
  }

  public static void main(String[] args){
    SavingsAccount2 zeusSavingsAccount = new SavingsAccount2("Zeus", 1000);
    zeusSavingsAccount.addMoney(2000);
    // Make a call to addMoney() to test your method

  }

}