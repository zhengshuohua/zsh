package com.hspedu.single;

public class SingleTon01 {

	public static void main(String[] args) {
//		GirlFriend xh = new GirlFriend("xh");
//      GirlFriend xb = new GirlFriend("xb");
		GirlFriend instance = GirlFriend.getInstance();
		System.out.println(instance);
	}
}
class GirlFriend{
	private String name;
    
	private static GirlFriend gf = new GirlFriend("ss");
	
	
	private GirlFriend(String name) {
		super();
		this.name = name;
	}
	public static GirlFriend getInstance() {
		return gf;
	}
	@Override
	public String toString() {
		return "GirlFriend [name=" + name + "]";
	}
	
}