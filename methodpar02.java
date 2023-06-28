public class methodpar02{
	public static void main(String[]args) {
		
		
		//test
		C c = new C();
		int[]arr = {1,2,3};
		c.test100(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}
		System.out.println();
	}
}
class C{
	public void test100(int[] arr) {
		arr[0] = 200;
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}
		System.out.println();
		
		
	}
}