public class Calculator{
  public Calculator(){

  }
 public int add( int a, int b){
   int add = a + b ;
   return add;
 }
public int subtract( int a, int b ){
  int  subtract = a - b;
  return subtract;
}

public int multiply(int a, int b){
int multiply = a * b ;
return multiply;
}
public int divide(int a ,int b ){
  int divide = a / b ;
  return divide;
}
public int modulo(int a , int b ){
  int modulo = a % b ;
  return modulo ;
}
public static void main(String[]args){
   Calculator myCalculator = new Calculator();
   System.out.println(myCalculator.add(5, 7));
   System.out.println(myCalculator.subtract(45, 11));
}
}