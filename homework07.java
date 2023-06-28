import java.util.Scanner;
public class homework07{
 public static void main(String[]args) {
  Scanner myScanner = new Scanner(System.in);
  for(int i = 1; i<=3 ; i++) {
   double sum = 0;
   for(int j =1 ; j <=5; j++) {
    System.out.println("请输入第"+i+"个班的第"+j+"个学生的成绩");
    double score = myScanner.nextDouble();
    sum += score;
    System.out.println("成绩为"+score);
   }
   System.out.println("sum="+sum+"平均分="+(sum/5));
   
  }
  
  
  
 }
}