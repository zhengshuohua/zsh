package com.hspedu.extend.rxercise;

public class ExtendsExercise01 {
   public static void main(String[]args) {
	   B b = new B();
	   
   }
}
class A{
	A(){
		System.out.println("a");
	}
	A(String name){
		System.out.println("a name");
	}
}
class B extends A{
	B(){
		this("abc");//只能调用同类的this 所以是调用下面的B
		System.out.println("b");
	}
	B(String name){
		//super();//父类的无参构造器
		System.out.println("b name ");
	}
}