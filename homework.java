public class homework{
    public static void main(String[]args) {
     double crash = 100000;
     int h = 0;
     int z = 0;
      
     while(crash>50000) {
         crash =  crash * 0.95;
         z++;
         
     }
     
     while(crash <=50000 && crash >=1000) {
      crash = crash-1000;
      z++;
     }
     
     System.out.println("可以过"+z+"次路口");
     
    }
}