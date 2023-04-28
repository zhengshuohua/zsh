public class ATM3{
  // Static variables
  public static int totalMoney = 0;
  public static int numATMs = 0;

  // Instance variables
  public int money;

  public ATM3(int inputMoney){
    this.money = inputMoney;
     numATMs += 1;
     totalMoney += inputMoney;
    // Steps 1 and 2: Edit numATMs and total money here
  }

  public void withdrawMoney(int amountToWithdraw){
    if(amountToWithdraw <= this.money){
      this.money -= amountToWithdraw;
      // Step 3: Edit totalMoney here
      totalMoney -= amountToWithdraw;
    }
  }

  public static void main(String[] args){

    System.out.println("Total number of ATMs: " + ATM3.numATMs); 
    ATM3 firstATM = new ATM3(1000);
    ATM3 secondATM = new ATM3(500);
    System.out.println("Total number of ATMs: " + ATM3.numATMs); 

    System.out.println("Total amount of money in all ATMs: " + ATM3.totalMoney);  
    firstATM.withdrawMoney(500);
    secondATM.withdrawMoney(200);
    System.out.println("Total amount of money in all ATMs: " + ATM3.totalMoney);    



  }

}