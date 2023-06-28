package com.hspedu.extend.extendstheory;

public class extendstheory {
    class GrandPa{
    	String name = "爷爷";
    	String hobby = "旅游";
    }
    class Father extends GrandPa{
    	String name = "爸爸";
    	int age= 39;
    }
    class son extends Father{
    	String name = "儿子";
    }
}
