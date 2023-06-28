package com.hspedu.interface_;

public interface AInterface {

	public int n1 = 10;
	public void hi();//抽象方法
	
}
class A implements AInterface{
	@Override
	public void hi() {
		// TODO Auto-generated method stub
	System.out.println("2");	
	}
}
