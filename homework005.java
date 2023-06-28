public class homework005{
/*
 * 5.定义一个圆类Circle,
 * 定义属性: 半径，提供显示圆周长功能的方法，
 * 提供显示圆面积的方法 Homework05.java*/
	  public static void main(String[]args) {
		  Circle yuan = new Circle(52.1);
		  System.out.println(yuan.ares());
		  System.out.println(yuan.len());
	  }
}
class Circle{
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double ares() {
		
		return Math.PI*radius*radius;
		
	}
public double len() {
		
		return 2*Math.PI*radius;
		
	}
}
