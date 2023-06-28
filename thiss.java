public class thiss{
	public static void main(String[]args) {
	
		Person4 p = new Person4("sss",20);
		
		System.out.println(p.age + p.name);
	}
}
class Person4{
	int age;
	String name;
	
	public Person4(String name,int age) {
		this.age = age; 
		this.name = name; 
	}
}