package com.hspedu.static_;

public class Codeblock {
public static void main(String[] args) {
	Movie movie = new Movie("ccc");
	
}
}
class Movie{
	private String name;
	private double price;
	private String director;
	//三个构造器 重载
	//代码块
	{
		System.out.println("aaa");
		System.out.println("bbb");
	}
	
	
	
	public Movie(String name) {
		super();
		this.name = name;
	}
	public Movie(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Movie(String name, double price, String director) {
		super();
		this.name = name;
		this.price = price;
		this.director = director;
	}
	
}