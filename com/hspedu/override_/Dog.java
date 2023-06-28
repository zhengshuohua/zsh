package com.hspedu.override_;

public class Dog extends animal {
//	1.因为dog是animal子类
//	2.dog的cry方法和animal的cry定义形式一样（名称 返回类型 参数）
//	3.这时我们就说dog的cry方法 重写了animal的cry方法
	public void cry() {
	    	System.out.println("猫");
	    }
}
