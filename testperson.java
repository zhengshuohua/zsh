public class testperson{
	public static void main(String[]args) {
		Person03 p1 = new Person03("jack",20);
		Person03 p2 = new Person03("james",50);
		System.out.print(p2.compareTo(p1));
		
	}
}
/*
 定义一个person类 里面有name age 提供compareTo方法比较判断两个人是否相等
 完全一样 返回true
 *
 *
 */
class Person03{
	String name;
	int age;
	public Person03(String name , int ane){
		this.age = age;
		this.name = name;
	}
	
	
	public boolean compareTo(Person03 p) {
		/*if(this.name.equals(p.name)&& this.age == p.age) {
			return true;
		}else {
		
		
		return false;
		}*/
		return this.name.equals(p.name)&& this.age == p.age;
	}
}