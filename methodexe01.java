public class methodexe01{
 public static void main(String[]args) {
  BB b = new BB();
  b.printt(4, 4, '*');
  if(b.isOld(2)) {
   System.out.println("is old");
  }else {System.out.println("not old");
   }  
 }
 
 
 
}
class BB{
 public boolean isOld(int n){
  return n%2!=0;
 }
 public void printt(int row,int col, char c) {
  for(int i = 0;i<row;i++) {
   for(int j = 0;j<col;j++) {
    System.out.print(c);
   }
   System.out.println();
  }
 }
}
