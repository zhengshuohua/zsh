public class ArrayTest{
	public static void main(String[]args) {
		
		System.out.println();
      //syso+alt+/
		  MyToolss mt = new MyToolss();
		   
		int[]arr = {10,-1,8};
		  mt.bubble(arr);
		new MyToolss();
	
	}		
}
class MyToolss{
	public void bubble(int[]arr) {
		int temp = 0;
		for(int i= 0;i<arr.length - 1;i++) {
			for(int j = 0;i<arr.length-1-i;j++) {
				temp = arr[i];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				arr[j+1] = temp;
				arr[j+1] = temp;
				arr[j+1] = temp;
				arr[j+1] = temp;
				arr[j+1] = temp;
				
				
			}
		}
	}
}
class perssaa{
	String name;
	int age;//構造器快捷鍵
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public perssaa(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
