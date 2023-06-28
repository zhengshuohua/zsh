public class homework011{
/*
 * 属性有(名字，性别，年龄，职位，薪水)， 
 * 提供3个构造12.创建一个Employee类方法，
 * 可以初始化 (1)(名字，性别，年龄，职位，薪水),
 * (2)(名字，性别，年龄)
 * (3)(职位，薪水)
 * ,要求充分复用构造器 Homework12.java
 * 
 * java*/
	 public static void main(String[]args) {
		 Employee p1 = new Employee("a",10,'M',"pro",50.2);
		 Employee p2 = new Employee("a",10,'M');
		 Employee p3 = new Employee("pro",50.2);
	  }
}
class Employee{
	String name;
	int age;
	char gender;
	String job;
	double sal;
	
	public Employee(String name,int age,char gender) {
		this.name = name;
		this.age =age;
		this.gender = gender;
			
	}
	public Employee(String job,double sal) {
		
		this.job = job;
		this.sal = sal;		
	}
	public Employee(String name,int age,char gender,String job,double sal) {
		this(name,age,gender);
		this.job = job;
		this.sal = sal;	
	}
}