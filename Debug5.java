public class Debug5 {

  public static void main(String[] args) {
    
    int width = 0;
    int length = 40;
    
    try {
      
      int ratio = length / width;
      
    } catch (ArithmeticException e) {
      
      System.err.println("ArithmeticException: " + e.getMessage());
      
    }
    
  }
  
}