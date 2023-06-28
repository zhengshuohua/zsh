package com.hspedu.poly_.polyarr_;

public class Teacher extends Person {
	private double salary;

    
	public Teacher(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	//重写父类say方法
	@Override
	public String say() {
		// TODO Auto-generated method stub
		return super.say()+salary;
	}
    //特有方法
	public void teach() {
		System.out.println(getName());
	}
}
