public class homework007{
/*
 * 7. 设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show()显示其信息
 * 并创建对象，进行测述 提示this.属性 
 *  Homework07.java*/
	  public static void main(String[]args) {
		  Dog08 p1 = new Dog08("a",50,"red");
		 p1.show();
	  }
}
class Dog08{
	String name;
	int age;
	String color;
	public Dog08(String name,int age,String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public void show() {
		System.out.println(name + age + color);
	}
}