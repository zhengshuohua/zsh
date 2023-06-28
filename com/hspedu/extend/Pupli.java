package com.hspedu.extend;
//小学生
public class Pupli {

	 public String name;
	 public int age;
	 private double score;
	
	public void setScore(double score) {
		this.score = score;
	}

   public void testing() {
	   System.out.println("小学生 "+ name +"正在考小学数学");
   }
    public void showInfo() {
    	System.out.println("小学生名字是 "+ name + "年龄"+age +"成绩"+score);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
