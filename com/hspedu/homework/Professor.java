package com.hspedu.homework;

public class Professor extends Teacher{

	public Professor(String name, int age, String post, double salary, double grade) {
		super(name, age, post, salary, grade);
		// TODO Auto-generated constructor stub
	}
     @Override
    public void introduce() {
    	// TODO Auto-generated method stub
    	 System.out.println("教授信息");
    	super.introduce();
    }
     
}
