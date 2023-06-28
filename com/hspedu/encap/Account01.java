package com.hspedu.encap;
/*
 * com.hspedu.encap 包: AccountTest.java  Account.java创建程序,
 * 在其中定义两个类: Account和AccountTest类体会Java的封装性
 * 1.Account类要求具有属性: 姓名 (长度为2位3位或4位) 、余额(必须>20)密码(必须是六位)
 * ，如果不满足，则给出提示信息，并给默认值·2.
 * 通过setXxx的方法给Account 的属性赋值。3
 * .在AccountTest中测试
提示知识点:String name=tarint len = name.length0):*/
public class Account01 {
     //为了封装，将三个属性设置为private
	private String name;
	private double balance;
	private String pwd;
	//提供两个构造器
	public Account01() {
		super();
	}
	
	
	public Account01(String name, double balance, String pwd) {
	super();
		this.setName(name);
		this.setBalance(balance);
		this.setPwd(pwd);
		//带有构造器的封装方法
	}


	public String getName() {
		return name;
	}
    public void setName(String name) {
		if(name.length()>=2 && name.length()<=4) {
    	
    	
    	this.name = name;
	}else {
		System.out.println("名字要求在2，3，4位，默认值为无名");
		this.name = "无名氏";
	}
		}
    public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		if(balance>20) {this.balance = balance;
	}else {
		System.out.println("余额必须为20以上 默认为20");
		this.balance = 20;
	}
		}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		if(pwd.length()==6) {this.pwd = pwd;
	}else {System.out.println("密码默认是6位 默认密码000000");
	this.pwd = "000000";
	}
		}
    public void shouInfo() {
    	System.out.println(name+balance);
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
