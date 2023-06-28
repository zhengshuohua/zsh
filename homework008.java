public class homework008 {//公有类
	int count = 9; //属性
public void count1(){//Test类的成员方法
             count=10;//就是属性10
             System.out.println("count1=" + count);
}
public void count2() {//Test类的成员方法
    System.out.println("count1=" + count++);
}
//这是Test类的main方法，任何一个类，都可有main
  public static void main(String args[]) {
//老韩解读
//1. new Test() 是匿名对象， 匿名对象使用后，就不能使用
// 2. new Test().count1() 创建好匿名对象后，就调用count1()
	 new  homework008() .count1();
	 homework008 t1= new homework008();
t1.count2();//后加加  先输出9在变成10 属性已经变成10了 
t1.count2();//后加加 先输出之前的10变成11


}
}