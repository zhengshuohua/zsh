package com.hspedu.poly_;
//判断 instanceof 判断对象的运行类型是否为xx类型或xx的子类型
public class PolyDetail03 {
   public static void main(String[] args) {
	BB bb = new BB();
	System.out.println(bb instanceof BB);
	System.out.println(bb instanceof AA);
	AA aa= new BB();
	System.out.println(aa instanceof AA);//判断运行类型
	System.out.println(aa instanceof BB);
	/**/
}
}
class AA{}//父类
class BB extends AA{} //子类
