public class methodex02{
	public static void main(String[]args) {
		
		Person3 p = new Person3();
		p.name = "milan";
		p.age =  18;
		//创建tools
		MyTools3 tools = new MyTools3();
		Person3 p2 = tools.copyPerson(p);
		//到此p和p2是person3的对象 两个独立对象属性相同
		System.out.println("P的属性 "+ p.age +" 名字= "+ p.name );
		System.out.println("P2的属性 "+ p2.age +" 名字= "+ p2.name );
	}
}
class Person3{
	String name;
	int age;
}
class MyTools3{
	//编写方法思路 1.确定返回类型void
	//2 方法名字copyPerson
	//方法形参（Person p）
	//方法体 创建一个新对象，并复制属性，返回即可
	public Person3 copyPerson(Person3 p) {
		Person3 p2=new Person3();
		p2.name = p.name;
		p2.age  = p.age;
		return p2;
		
	}
}