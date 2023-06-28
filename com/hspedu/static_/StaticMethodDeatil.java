package com.hspedu.static_;

public class StaticMethodDeatil {
public static void main(String[] args) {
	D.hi();
	//D.say(); 非静态方法不能通过类名调用
	new D().say();//需要创建对象实例才能调用非静态变量
}
}
class D{
	public void say() {
		
	}
	public static void hi() {
		
	}
}
