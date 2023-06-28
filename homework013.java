public class homework013{
/*
 * 将对象作为参数传递给方法。
 *  Homework13.java题目要求:
 *  (1) 定义一个Circle类，包含一个double型的radius属性代表圆的半径，
 *  findArea(方法返回圆的面积。
 * (2) 定义一个类PassObject，在类中定义一个方法printAreas0，
 * 该方法的定义如下public void printAreas(Circle c, int times)//方法签名
 * (3)在printAreas方法中打印输出1到times之间的每个整数半径值，
 * 以及对应的面积例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 * (4)在main方法中调用printAreas0方法，调用完毕后输出当前半径值。程序运行结果如图所示
 * java*/
	 public static void main(String[]args) {
		 
		 Circle01 c = new Circle01();
		 PassObject po = new PassObject();
		 po.printAreas(c, 5);
	 }
}
class Circle01{
	double radius;
	public Circle01() {
		
	}
	public Circle01( double radius) {
		this.radius =radius;
	}
	public double findArea() {
		 
		return Math.PI * radius*radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
		
	}
}
class PassObject{
	public void printAreas(Circle01 c ,int times) {
		System.out.println("radius\tarea");
		for(int i = 1;i <= times;i++) {
			c.setRadius(i);
			System.out.println(i + "\t"+c.findArea());
			c.findArea();
			
			
		}
	}
	
	
	
	
	
}