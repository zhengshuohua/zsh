public class varParameterDetaill{
	public static void main(String[]args) {
		int[]arr = {1,2,3};
		TTt t1 = new TTt();
		t1.f1(arr);
	}
}
class TTt{
	public void f1(int...nums) {
		//可变参数本质是数组
		
		
	}
	public void f2(String str,int...nums) {
		//可变参数可以和普通类型参数放在一起 但是要放在最后
		
		//只能出现一个可变参数
	}
}