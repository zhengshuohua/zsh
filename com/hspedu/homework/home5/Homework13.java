package com.hspedu.homework.home5;

public class Homework13 {
public static void main(String[] args) {
	
	Teacher teacher = new Teacher("张飞", '男',80,5);
	teacher.printInfo();
	System.out.println("------------------------- 	");
	Student student = new Student("小米", '男',15,"588888");
	student.printInfo();
	Homework13 homework13 = new Homework13();
	homework13.bubbleSort(null);
	//定义多态数组
    Person[] persons = new Person[4];
    persons[0] = new Student("jack",'男',10,"0001");
    persons[1] = new Student("jac",'男',20,"0002");
    persons[2] = new Student("ja",'男',30,"0003");
    persons[3] = new Student("j",'男',40,"0004");
}
public void test(Person p) {
	if(p instanceof Student) {
		((Student) p).study();
	}else if(p instanceof Teacher) {
		((Teacher) p).teach();
	}else {
	      System.out.println("do nothing...");}
}

    //年龄从高到低
      public void bubbleSort(Person[] persons) {
    	  Person temp = null;
    	  for(int i =0; i<persons.length-1;i++) {
    		  for(int j =0;j<persons.length-1-i;j++) {
    			 if(persons[j].getAge() < persons[j+1].getAge()) {
    			  temp = persons[j];
    			  persons[j] = persons[j+1];
    			  persons[j+1] = temp;
    			 }
    		  }
    	  }
      }


}
