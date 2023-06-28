
public class homework004{
/*
 * 编写类A03，实现数组的复制功能copyArr
 * 输入旧数组得返回一个新数组,元素和旧数组一样 Homework04.java*/
	  public static void main(String[]args) {
		int[] arr = {101,1,4};
		  A03 a03  = new A03();
		  int[]newArr = a03.copyArr(arr);
	
		  for(int i = 0 ;i<newArr.length;i++) {
				System.out.print(newArr[i] + "\t");
			} 
		  
	  }
}
class A03{
	public int[] copyArr(int[]arr) {
		 int newArr[] = new int[arr.length];
		for(int i = 0 ;i<arr.length;i++) {
			newArr[i] = arr[i] ;
		} 
		
		return newArr; 
	}
}