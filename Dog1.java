public class Dog1{
	String name;
	int age;
	boolean isHealthy;
	public Dog1(String dogName,int dogAge,boolean health) {
		name = dogName;
		age = dogAge;
		isHealthy = health;
		
	}
	public static void main(String[]args) {
		Dog1 duffy = new Dog1("james",10,true);
		
		boolean isbetterTen = duffy.age>10;
		System.out.println(duffy.age);
		System.out.println(duffy.name);
		System.out.println(duffy.isHealthy);
		System.out.println(isbetterTen);
	}
}