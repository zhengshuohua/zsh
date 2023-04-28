// Import statement:
import java.util.ArrayList;
class PrimeDirective { 
  // Add your methods here:
  public  boolean isPrime(int number) {
	  if(number <= 1) {
		  return false;
	  }
	  for(int x = 2;x < number;x++) {
		  if(number % x == 0) {
			  return false;
		  }else {
			  return true;
		  }
	  }
	  return true;
	  
  }
  public ArrayList<Integer> onlyPrimes(int []numbers){
	  ArrayList<Integer> empty = new  ArrayList<Integer>();
	  for(int number : numbers) {
		  if(isPrime(number)) {
			  empty.add(number);			  
		  }
		  
	  }
	  
	  return empty; 
  } 
  public static void main(String[] args) {
    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.isPrime(28)); 
    System.out.println(pd.onlyPrimes(numbers));
  }  
}