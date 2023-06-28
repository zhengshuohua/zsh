public class method01{
 
 public static void main(String[]args) {
  //方法使用 方法写好后如果不去调用 就不会输出语句 不会生效
  persson p1 = new persson();
  
  p1.speak();
  p1.cal01();
  p1.cal02(10);
  p1.get(2, 177);
 }
 
}
class persson{
 
 String name;
 int age;
 public void speak() {
  System.out.println("im a good person");
  //speak() 表示speak是方法名（）是行参列表
  
 }
 public void cal01(){
  int sum = 0;
  for(int i=1;i<=1000;i++) {
   sum+= i;
  }
  System.out.println(sum);
 }
 public void cal02(int n) {
  int sum = 0;
  for(int i=1;i<=n;i++) {
   sum+= i;
  }
  System.out.println(sum);
 }
 public int getSum(int num1,int num2) {
  int res = num1+num2;
  return res;
  //表示把res的值返回
 }
 public void get(int y,int x) {
  int sss= x*y;
  System.out.println(sss);
 }
 
 
 
}