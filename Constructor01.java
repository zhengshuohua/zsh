public class Constructor01{
	public static void main(String[]args) {
		//当我们new一个对象的时候，直接通过构造器指定名字和年龄
		//Personn p1 = new Personn();
		//p1.Peronn("smith", 80);
		Personnn p1 = new Personnn("smith", 80);
		System.out.println("p1信息如下");
		System.out.println("p1对象的name=" + p1.name);
	}
}


class Personnn{
	String name;
	int age;
	//构造器
	//1.构造器没有返回值 没有void 
	//2.构造器的名字是和类名一样
	//3.(String pName,int pAge) 是构造器形参列表和成员方法的规则一样
	
	public  Personnn(String pName,int pAge) {
		System.out.print("构造器被调用");
		name = pName;
		
		age = pAge;
		
	}
}