public class constructorExercise{
	public static void main(String[]args) {
		Person2 p2 = new Person2();
		Person2 p3 = new Person2("sss",20);
		System.out.println(p2.name + p2.age);
		System.out.println(p3.age + p3.name);
	}
}

class Person2{
	int age;
	String name;
	public Person2() {
		age = 18;
	}
	public Person2(String pName,int pAge) {
		age =  pAge;
		name = pName;
	}
}