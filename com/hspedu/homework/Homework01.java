package com.hspedu.homework;

public class Homework01 {
   public static void main(String[] args) {
	  Person[] persons = new Person[3];
	  persons[0] = new Person("jack",10,"javaee");
	  persons[1] = new Person("tom",50,"dashuju");
	  persons[2] = new Person("mary",30,"php");
	  for(int i = 0;i<persons.length;i++) {
		  System.out.println(persons[i]);
	  }
	  //冒泡排序
	  Person tmp = null;
	  for(int i = 0;i<persons.length-1;i++) //外层循环
		  {
		   for(int j = 0;j<persons.length-1-i;j++)//内层循环
		   {
			   if(persons[i].getAge()<persons[i+1].getAge()) {
				   tmp = persons[i];
				   persons[i]=persons[i+1];
				   persons[i+1] = tmp ;
			   }
		   }
	  }
	  for(int i = 0;i<persons.length;i++) {
		  System.out.println(persons[i]);
	  }
	  
	  
	  
	 }
}
class Person{
	private String name;
	private int age;
	private String job;
	public Person(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
}
