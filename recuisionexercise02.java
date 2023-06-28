public class recuisionexercise02{
 public static void main(String[]args) {
  E e = new E();
  int day = 1;
  int peathNum = e.peath(day);
  System.out.print("第 "+ day +"天有" +peathNum +"ge peath");

  
 }
}

class E{
 public int peath(int day) {
  if(day == 10) {
   return 1;
  }else if(day >=1 && day<=9) {
   return (peath(day + 1)+1)*2  ;
  }else {
   System.out.print("day zai 1-10");
   return -1;
  }
  
  
  
 }
}