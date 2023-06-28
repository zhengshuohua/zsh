public class VarScopeDetail{
	public static void main(String[]args) {
		Personn p1 = new Personn();
		p1.say();
	}
}
class Personn{
	String name = "jack";//属性
	public void say() {
		String name = "king";//局部变量
		System.out.print(name);//属性合局部一样  遵循就近原则 输出king
	}
	public void hi() {
		String address = "北京";
		//String address = "伤害"; 局部变量相同不行
		
	}
	
	
}
class tt{
	Personn p1 = new Personn();//不同类可以相互调用方法 通过过创建对象实现
	//局部变量只能在本类中
	
}