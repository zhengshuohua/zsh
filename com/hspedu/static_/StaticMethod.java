package com.hspedu.static_;

public class StaticMethod {
 public static void main(String[] args) {
	Stu tom = new Stu("tom");
	tom.payFee(100);
	Stu mar = new Stu("mar");
	mar.payFee(300);
}
}
class Stu{
	private String name;
	private static double fee = 0;
	public Stu(String name) {
		super();
		this.name = name;
	}
    public static void payFee(double fee) {
    	Stu.fee +=fee;
    }
    public void stashowFee() {
    	System.out.println(false);
    }
}
