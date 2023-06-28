public class method03{
 public static void main(String[]args) {
  AAe a = new AAe();
  a.sayOk();
 }
}
class AAe {
 //同一类中 可以直接调用不需要创建新对象
 public void print(int n) {
  System.out.println(n); 
 }
 public void sayOk() {
  print(10);
  System.out.println(123);//调用同类中的方法 直接调用
 }
 
 public void m1() {
	 //不同类不可以直接调用 要创建对象
	 BBE b = new BBE();
	 b.hi();
 }
}
class BBE{
	public void hi() {
		System.out.println("B类中的hi（）被执行");
	}
}