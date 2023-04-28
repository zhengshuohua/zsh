public class Store4 {
  // instance fields
  String productType;
  
  // constructor method
  public Store4(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
		System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
  }
  
  // main method
  public static void main(String[] args) {
    Store4 lemonadeStand = new Store4("Lemonade");
    lemonadeStand.advertise();
    lemonadeStand.advertise();
    lemonadeStand.advertise();
    
  }
}
