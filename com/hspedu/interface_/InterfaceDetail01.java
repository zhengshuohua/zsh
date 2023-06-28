package com.hspedu.interface_;

public class InterfaceDetail01 {

	
}
interface IA{
	void say();
	void hi();
	
}
interface IB{
	
}
class Cat implements IA{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hi() {
		// TODO Auto-generated method stub
		
	}
	
}
abstract class tiger implements IA,IB{
	
}