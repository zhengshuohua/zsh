package com.hspedu.extend.improve;
//父类 是pupil和 graduate的父类
public class student {
	 public String name;
	 public int age;
	 private double score;
	 public void setScore(double score) {
			this.score = score;
		}

	   public void showInfo() {
	   	System.out.println("学生名字是 "+ name + "年龄"+age +"成绩"+score);
	   }
}
