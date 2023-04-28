public class TestReturn{
	String productType;
	double price;
	public TestReturn(String product,double initalPrice) {
		productType = product;
		price = initalPrice;
		
	}
	public void increasePrice(double priceToAdd) {
		double newPrice = price + priceToAdd;
		price = newPrice;
		
	}
	public double getPriceWithTax() {
		double tax = 0.08;
		double totalPrice = price + price*0.08;
		return totalPrice;
	}
	public static void main(String[]args) {
		TestReturn lemonadeStand = new TestReturn("Lemonade",3.75);
		double lemonadePrice = lemonadeStand.getPriceWithTax();
		System.out.println(lemonadePrice);
	}
	
	
	
	
	
	
	
}