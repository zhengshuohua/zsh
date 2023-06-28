package com.hspedu.homework.home5;

public class Worker extends Emoplyee {
	private double bonus;

	public Worker(double sal, String name, double bonus) {
		super(sal, name);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public void PrintSal() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"工资是 "+(getSal()+bonus));
	}
     
}
