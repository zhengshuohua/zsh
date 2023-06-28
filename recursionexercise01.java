public class recursionexercise01{
 public static void main(String[]args) {
  J j = new J();
  int res = j.fibonacci(7);
  System.out.print("斐波那契数等于" + res);
 }
}
class J{
 public int fibonacci(int n) {
  if (n >=1) {
  if (n ==1 || n ==2 ) {
   return 1;
  }else {
   return fibonacci(n-1) + fibonacci(n-2);
  }
  }
  else {
   System.out.print("false");
   return -1;
  }
 }
}