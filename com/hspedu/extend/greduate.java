package com.hspedu.extend;
//大学生情况 模拟大学生
public class greduate {

	 public String name;
	 public int age;
	 private double score;
	
	public void setScore(double score) {
		this.score = score;
	}

  public void testing() {
	   System.out.println("大学生 "+ name +"正在考大学数学");
  }
   public void showInfo() {
   	System.out.println("大学生名字是 "+ name + "年龄"+age +"成绩"+score);
   }

}
