class Noodle{
	double lengthInCentimeters;
	String shape;
	String texture = "brittle";
  public String cook() {
	  
	  return "cooked";
	  
	
  }
  public static void main(String[]args) {
	  
	  Spaghetti spaghettiPomodoro = new  Spaghetti();
	  Noodle spaghettiPomodoro1 = new Noodle();
	  System.out.println(spaghettiPomodoro.texture);
	  System.out.println(spaghettiPomodoro1.cook());
	
	  
	 
	  
	  
	  
	  
  }
	
	
  	
	
}