package com.hspedu.poly_;

public class Poly01 {
 public static void main(String[] args) {
	        Master tom = new Master("tom");
	        Dog dog = new Dog("大黄");
	        Bone bone = new Bone("大棒骨");
	        tom.feed(dog, bone);
	        Cat cat = new Cat("小花猫");
	        Fish fish = new Fish("黄花鱼");
	        System.out.println("===========");
	        tom.feed(cat, fish);
}
}
