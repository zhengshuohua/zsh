package com.hspedu.override_;

public class OverredeExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person person = new Person("jack", 10);
        System.out.println(person.say());
        Student student = new Student("aaa", 10, 20, 30);
        System.out.println(student.say());
	}

}
