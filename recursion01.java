public class recursion01{
	//递归
	public static void main(String[]args) {
		T t1 = new T();
		t1.test(4);
		int res = t1.factorial(3);
		System.out.println("res= " +res);
	}
}
class T{
	public void test(int n) {
		if( n> 2) {
			test(n-1);
		}
System.out.println("n=" + n);	
	}
	//递归执行 先输出最后递归的2 然后3 4
	
	//factorial阶乘
	public int factorial(int n) {
		if(n == 1) {
			return 1;
		}else {
			return factorial(n - 1)*n;
		}
	}
	//从 1*2*3*4*5 输出120 当n=1的时候返回1，

}