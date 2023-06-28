package com.hspedu.poly_;

public class Master {
      private String name;

	public Master(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    //主任给小狗喂骨头
	public void  feed(Animal animal,Food food) {
		System.out.println("主人 "+name+"给"+animal.getName()+"吃"+food.getName());
	}
	
	
	//使用多态机制 可以统一管理主人喂食问题
//	public void  feed(Dog dog,Bone bone) {
//		System.out.println("主人 "+name+"给"+dog.getName()+"吃"+bone.getName());
//	}
//	public void feed(Cat cat, Fish fish) {
//		System.out.println("主人 "+name+"给"+cat.getName()+"吃"+fish.getName());
//	}
}
