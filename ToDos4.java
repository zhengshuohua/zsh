import java.util.ArrayList;
class ToDos4{
	public static void main(String[]args) {
		ArrayList<String> sherlocksToDos = new ArrayList<String>();
		sherlocksToDos.add("visit the crime scene");
	    sherlocksToDos.add("play violin");
	    sherlocksToDos.add("interview suspects");
	    sherlocksToDos.add("solve the case");
	    sherlocksToDos.add("apprehend the criminal");
	    System.out.println(sherlocksToDos.size());
	    
	    // Poirot
	    ArrayList<String> poirotsToDos = new ArrayList<String>();
	    
	    poirotsToDos.add("visit the crime scene");
	    poirotsToDos.add("interview suspects");
	    poirotsToDos.add("let the little grey cells do their work");
	    poirotsToDos.add("trim mustache");
	    poirotsToDos.add("call all suspects together");
	    poirotsToDos.add("reveal the truth of the crime");
	    System.out.println(poirotsToDos.size());
	    // Print the size of each ArrayList below:
	    
	    if(poirotsToDos.size()<sherlocksToDos.size()) {
	    	 System.out.println("Sherlock");
	    } else {
	    	 System.out.println(" Poirot");
	    }
	    // Print the name of the detective with the larger to-do list:
	    
		
		
		
		
		
	}
}