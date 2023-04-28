public class Store7 {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store7(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }

  // main method
  public static void main(String[] args) {
    Store7 lemonadeStand = new Store7("Lemonade", 3.75);

    double lemonadePrice = lemonadeStand.getPriceWithTax();
    
    System.out.println(lemonadePrice);
  }
}