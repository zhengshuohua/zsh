public class thisdeatil{
	public static void main(String[]args) {
		T01 t1 = new T01();
		t1.f2();
	}
}
class T01{
	/*
	 * 细节 访问构造器语法：this（参数列表）；
	 * 注意只能在构造器中使用 即只能在构造器中访问另外一个构造器
	 * 
	 * 
	 * 
	 * */
	
	public T01() {
		this("jack",100);
		//访问构造器语法必须放在第一条
	}
	public T01(String name,int age) {
		
	}
	
	//this可以访问成员方法的属性 this.方法名（参数列表）
	public void f1() {
		System.out.print("f1（）方法");
	}
	public void f2() {
		System.out.print("f2（）方法");
		//调用本类的f1方法
		//第一方式
		f1();
		//第二种
		this.f1();
		
	}
	public void f3() {
		//this可以用来访问关键属性
		
	}
}