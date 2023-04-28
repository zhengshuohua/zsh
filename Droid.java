public class Droid{
  int batteryLevel ;
  String name ;
  char x = '"';

  public Droid (String droidName ){
    name = droidName;
    batteryLevel = 100 ;
  }

public void performTask(String task){
 System.out.println( name + " is performing task: "+ task );
 batteryLevel = batteryLevel - 10 ;
}

public void energyReport(int batteryLevel) {
	batteryLevel = batteryLevel - 10 ;
	if (batteryLevel >= 10) {
		System.out.println(" Now the batteryLevel is " + x + batteryLevel + x + "!" );
	}else {
		System.out.println(" Now " +name+ " can't moving" + "!" );
	}
	
}

 public String toString(){
   return "Hello, I’m the droid: "+ name ;
 }
public static void main(String[]args){
 Droid  myDroid = new  Droid("\"Code8\"");
 System.out.println(myDroid);
 myDroid.performTask("dancing");
 myDroid.energyReport(51);
 
}

}