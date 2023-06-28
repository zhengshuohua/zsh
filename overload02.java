public class overload02{
	public static void main(String[]args) {
     methods method = new methods();
     method.m(10);
     method.m(10,20);
     method.m("ccc");
		
	}
}

/*
 编写程序，类methods中定义三个重载方法并调用 方法m
 三个方法分别接收一个int参数两个in参数 一个字符串参数 分别执行平方运算并和输出
 */
class methods{
	public void m(int n ) {
		System.out.println("平方= " + (n*n));
	}
	public void m(int n1, int n2) {
		System.out.println("相乘= "  + (n1*n2));
	}
	public void m(String str) {
		System.out.println("传送string = "  + str);
	}
}
