package com.hspedu.homework;

public class Homework03 {
	public static void main(String[] args) {
		Professor professor = new Professor("aaa",30,"bbb",803.1,1.3);
		professor.introduce();
		Teacher teacher = new Teacher("aaa",30,"bbb",803.1,1.3);
		teacher.introduce();
		Professor professor1 = new Professor("aaa",30,"bbb",803.1,1.3);
		professor1.introduce(); 
	}
}
