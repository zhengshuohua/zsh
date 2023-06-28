public class homework08{
 public static void main(String[]args) {
     int[]arr = {10,12,45,90};
     int insertNum = 8;
     int index = -1;
     for (int i = 0; i <arr.length; i++){
    	 if(insertNum <= arr[i]) {
    		 index = i ;
    		 break;
    	 }
     }
    if(index == -1) {
    	index = arr.length;
    	
    }
    //检索是否跑过循环
        int[]arrNew = new int[arr.length+1];
       // int[]arr = {10,12,45,90};
         for(int i = 0, j = 0 ; i < arrNew.length;i++) {
        	 
        	 if( i !=index) {
        		 arrNew[i] = arr[j];
        		 j++;
        	 }else {
        		 arrNew[i] = insertNum;
        	 }
         }
     arr = arrNew;
     System.out.println("=========插入后情况==========");
     for(int i = 0;i< arr.length;i++) {
    	 System.out.print(arr[i] + "\t");
     }
         
         
         
 }
 
}