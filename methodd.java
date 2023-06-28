public class methodd{
 public static void main(String[]args) {
  AA a = new AA();
  int []ae = {0,2,4} ;
  int[]res = a.getSumAndSub(1, 7,"q");
  System.out.println(res[0]);
  
  System.out.println(res[1]);
  a.getSumAndSub(2, 3,"jack");
 }
}
class AA{
 public int[]getSumAndSub(int n1,int n2,String name){
  int[]resArr = new int[2];
  //参数顺序必须一致
  resArr[0] = n1 + n2;
  resArr[1] = n1 - n2;
  return resArr;
 }
}