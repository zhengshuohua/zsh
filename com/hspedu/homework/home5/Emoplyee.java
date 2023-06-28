package com.hspedu.homework.home5;

public class Emoplyee {

	private double sal;
	private String name;


	public Emoplyee(double sal, String name) {
		super();
		this.sal = sal;
		this.name = name;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public void PrintSal() {
		System.out.println(name+"工资是 "+sal);
	}
}
