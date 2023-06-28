public class homework001{
	/*
	 * 1.编写类A01，定义方法max，实现求某个double数组的最大值，并返回Homework01.java*/
	public static void main(String[]args) {
		double [] x;
		A01 a1 = new A01() ;
		double[]arr = {8,8,9,10,11.5};
		Double res = a1.max(arr);
		if(res !=null) {
		System.out.print(a1.max(arr));
		}else {
			System.out.print("false");
		}
	}
}
class A01{
	public Double max(double[]arr) {	
		//保证arr至少有一个元素
		if(arr !=null && arr.length > 0 ) {
		double max = arr[0];//假定第一个元素是最大值
		for(int i = 1 ; i<arr.length;i++ ) {
			if (max < arr[i]) {
			 max = arr[i];//假定第一个元素是最大值
			 }
			}
		return max;
	
		}else {
			return  null;
		}
		
	}
}