public class PropertiesDetaill{
    public static void main(String[]args) {
    	Personna p1 =  new Personna();
       //p1是对象名（对象引用
    	//new Personna（）创建的对象空间数据才是真正的对象
    	
    	
    	System.out.println("\n当前这个人的信息");
    	p1.age = 10;
    	p1.name = "小明";
    	Personna p2 = p1 ;
    	
    	System.out.println(p2.age);
    	
    }
}

class Personna{
    int age;
    String name;
    double sal;
    boolean isPass;
}