public class homework03{
 public static void main(String[]args) {
  
  int count = 0 ;
  for(int x = 1; x<=100;x++) {
   
   if(x%5 != 0) {
   
   
   count++;
   System.out.print(x + " "); 
   
   if(count%5 == 0) {
    System.out.println();
    
   }
   }
  }
  int y = 0;
while (y<100){
     y++;
     
 if(y%5==0){
  continue;
 }
 
 System.out.print(y +  " ");
 count++;
 if(count%5 == 0){
 System.out.println();  
}
 }
 







 
 

  
  
  
  
 }
}