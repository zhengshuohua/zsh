public class homework006{
/*
 * 编程创建一个Cale计算类
 * 在其中定义2个变量表示两个操作数
 * 定义四个方法实现求和、差、乘、商(要求除数为0的话，要提示)
 * 并创建两个对象分别测试Homework06.java*/
	  public static void main(String[]args) {
		  Cale a1 = new Cale(10,20);
		  Cale a2 = new Cale(1,2);
		 System.out.print(a1.plus()) ;
		 System.out.print(a1.min()) ;
		 System.out.print(a2.plus()) ;
	
		 System.out.print(a2.min());
	  }
}
class Cale{
	double x;
	double y;
	public Cale(double x ,double y) {
		this.x = x;
		this.y = y;
	}
	public double plus() {
	return  x+y;
		
	}
	
	public  double min() {
		return  x-y;
	}
	
}