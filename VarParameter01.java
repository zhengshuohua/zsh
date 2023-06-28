public class VarParameter01{
	public static void main(String[]args) {
		HspMethod m = new HspMethod();
		System.out.print(m.sum(1,5,100));
	}
}
class HspMethod{
	/*public int sum(int n1,int n2) {
		return n1+n2;
	}
	public int sum(int n1,int n2,int n3) {
		return n1+n2+n3;
	}*/
	
	//上面三个方法名称 功能相同 参数个数不同 可以使用可变参数优化
	
	//int...表示接受的是可变参数，类型是int，即可以接收多个int
	public int sum(int... nums) {
		//System.outa /.println("接受的参数个数= " +nums.length); 
		//return 1;
		int res = 0;
		for(int i = 0;i<nums.length;i++) {
			res +=nums[i];
		}
		return res;
	}
	
}