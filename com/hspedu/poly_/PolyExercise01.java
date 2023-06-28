package com.hspedu.poly_;

public class PolyExercise01{
	public static void main(String[] args) {
		double d = 13.4;//ok
		long l = (long)d;//ok
		System.out.println(l);//13
		int in = 5;//ok
	  //  boolean b = (boolean)in; 不对 boolean不能转int
	    Object obj = "Hello";//ok 向上转型
	    String objStr = (String)obj;//可以 向下转型
	    System.out.println(objStr);//hello
	   Object objPri = new Integer(5);//向上转型
	   //String str = (String)objPri;错误 objPri运行类型是integer不是string
	   Integer str1 = (Integer)objPri;//ok 向下转型
	}
}