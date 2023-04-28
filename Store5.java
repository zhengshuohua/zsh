public class Store5{
	String productType ;
	
	public Store5(String product){
		productType = product;
		
	}
	public void advertise() {
		String message = "Selling "+productType +"!";
		System.out.println(message);
		
	}
	public static void main(String[]args) {
	  String cookie = "Cookies";
	  Store5 cookieShop = new Store5(cookie);
	  
	  
	cookieShop.advertise();
	
	
	}
	}
	
	
