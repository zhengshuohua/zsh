public class ConstructorDetail{
	public static void main(String[]args) {
		//当我们new一个对象的时候，直接通过构造器指定名字和年龄
		//Personn p1 = new Personn();
		//p1.Peronn("smith", 80);
		Person1 p1 = new Person1("smi", 40);
		System.out.println("p1信息如下");
		System.out.println("p1对象的name=" + p1.name);
		Person1 p2 = new Person1("smi");
	}
}
class Dog2{
	//如果没有定义构造器，系统会自动给类生成一个默认五构造器
	/*
	 * 默认构造器
	 * Dog2(){
	 * }
	 * 
	 * 
	 * 
	 * */
	
}
class Person1{
	String name ;
	int age;
	//构造器
	public Person1(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
	//第二个构造器，构造器的重载
	public Person1(String pName) {
		name = pName;
	
	}
	
	
}