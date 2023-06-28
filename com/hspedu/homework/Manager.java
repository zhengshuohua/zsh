package com.hspedu.homework;

public class Manager extends Employee{
	private double bonus;

	public Manager(String name, double daySal, int workDays, double grade) {
		super(name, daySal, workDays, grade);
		
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public void printSal() {
		// TODO Auto-generated method stub
		System.out.println("经理 "+getName()+"工资是= "+( bonus+
				getDaySal()*getWorkDays()*getGrade()));
	}

}
