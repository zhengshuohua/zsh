public class Order4 {
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public Order4(boolean filled, double cost, String shippingMethod) {
		
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship(double cost) {
	  if (cost > 24.00) {
	      System.out.println("High value item!");
	    } else {
	      System.out.println("Low value item!");
	    }
    if (isFilled) {
      System.out.println("Shipping");
    } else {
      System.out.println("Order not ready");
    }
    
    double shippingCost = calculateShipping();
    
    System.out.println("Shipping cost: ");
    System.out.println(shippingCost);
  }
  
  public double calculateShipping() {
    double shippingCost;
    switch (shipping) {
      case "Regular":
        shippingCost = 0;
        break;
      case "Express":    
        shippingCost = 1.75;
        break;
      default:
        shippingCost = .50; 
    }
    return shippingCost;
 	}
  
  public static void main(String[] args) {
    // create instances and call methods here!
    Order4 thx = new Order4(false,8.88,"Express");
    Order4 ttt = new Order4(true,88.12,"yes");
  
    thx.ship(8.88); 
    System.out.println("--------------------");
    ttt.ship(88.12);
  }
}
