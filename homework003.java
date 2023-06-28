/*
 * 编写类Book，定义方法updatePrice，实现更改某本书的价格，具体: 如果价格>150,
 * 则更改为150，如果价格>100,更改为100，否则不变 Homework03.java
 * 
 * 
 * */
public class homework003{

	  public static void main(String[]args) {
		 /*Bood a03 = new Bood();
		 int hPrice = a03.updatePrice(-1);
		 System.out.print(hPrice);*/
		  Bood a03 = new Bood("a",300);
		  a03.info();
		  
	  }
}
class Bood{
	/*public int updatePrice(int price) {
		
		if (price > 150) {
			price = 150;
			return price;
		}else if(price>100&&price<=150){
			price = 100;
			return price;
		}else {
			return price;
		}
	}*/
	String name ;
	double price;
	public Bood(String name,double price) {
		this.name = name;
		this.price = price;
		
	}
	public void updatePrice() {
		if(this.price>150) {
			this.price = 150;
		}
	}
	public void info() {
		System.out.println(this.name + this.price);
	}
	
}