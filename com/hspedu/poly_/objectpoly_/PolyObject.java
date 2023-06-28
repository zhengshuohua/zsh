package com.hspedu.poly_.objectpoly_;

public class PolyObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //体验对象多态特点
		
		//animal 编译类型是Animal，运行类型是Dog
		Animal animal = new Dog();//多态向上转型
		animal.cry(); //因为运行时 这时 ，animal的运行类型是Dog
		            //所以执行的时候是Dog的地方
		animal = new Cat();
		animal.cry();//变成运行类型Cat了
		Cat cat=(Cat) animal;//多态向下转型
		
		
	}

}
