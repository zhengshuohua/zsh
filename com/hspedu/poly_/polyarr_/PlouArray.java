package com.hspedu.poly_.polyarr_;

public class PlouArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[]persons = new Person[5];
		persons[0] = new Person("jack",20);
		persons[1] = new Student("qwe", 18,100);
		persons[2] = new Student("smith", 19,30.1);
		persons[3] = new Teacher("scott", 30,20000);
		persons[4] = new Teacher("king", 50,25000);
		//循坏遍历多态数组，调用say
		for(int i = 0;i<persons.length;i++) {
			//persons[i]的编译类型是Person，运行类型根据实际情况来看
			//比如persons[1]的运行类型是Student
			System.out.println(persons[i].say());
			if(persons[i] instanceof Student) {
			  Student student = (Student)persons[i];
			  student.study();
			}else if(persons[i] instanceof Teacher) {
				Teacher teacher = (Teacher)persons[i];
				teacher.teach();
			}
			
		}
		
	}

}
