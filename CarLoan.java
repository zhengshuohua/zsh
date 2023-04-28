public class CarLoan {
	public static void main(String[] args) {
    int carloan = 10000;
    int loanlength = 3 ;
    //3 年的贷款期限
    int interestRate = 5 ;
    //贷款利率为 5%
    int downPayment = 2000;
    //预付款
    if(loanlength <= 0 && interestRate <= 0) {
    	System.out.println("Error! You must take out a valid car loan.");
    	
    }else if(downPayment >= carloan) {
    	System.out.println("The car can be paid in full.");
    	 
    }else{
    	int remainingBalance = carloan - downPayment;
    	int months = 12;
    	int monthlyBalance = remainingBalance/ months/loanlength;
    	int interest = monthlyBalance*interestRate/100;
    	int monthlyPayment = monthlyBalance + interest ;
    	System.out.println(monthlyPayment);
    }
    
	
		
		
		
		
		
	}
}