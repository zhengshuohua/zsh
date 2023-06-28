public class overload01{
	public static void main(String[]args) {
		System.out.println();
		
		mycalculator mc = new mycalculator();
		System.out.println(mc.calculate(1, 2));
	}
}
class mycalculator{
	
	//方法重载
	// 1.方法名必须相同
	// 2.参数列表必须不同（参数类型或个数或顺序，至少有一样不同，参数名无要求比如 int n1 和int c1）
	// 3.返回类型 无要求
	public int calculate(int n1,int n2) {
		return n1+n2;
	}
	public double calculate(int n1,double n2) {
		return n1+n2;
	}
	public double calculate(double n1 ,int n2) {
		return n1+n2;
	}
	public int calculate(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
	
	
}