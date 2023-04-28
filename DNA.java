// DNA Sequencing
public class DNA{
	public static void main(String[]args) {
		
		// -. .-.   .-. .-.   .
		//   \   \ /   \   \ /
		//   / \  \   / \   \
		//  ~   `-~ `-`   `-~ `-
		String dna1 = "ATGCGATACGCTTGA";
		String dna2 = "ATGCGATACGTGA";
		String dna3 = "ATTAATATGTACTGA";
		String dna = dna1 ;
		int x = dna.length();
		System.out.println("Length: " + x);
		
		int a =dna1.indexOf("ATG");
		
		System.out.println("Start: " + dna1.indexOf("ATG"));
		int b =dna1.indexOf("TGA");
		
		System.out.println("Stop: " + dna1.indexOf("TGA"));
		
		
		int y = dna1.indexOf("TGA")-dna1.indexOf("ATG")+ 1 ;
		
		if(a !=-1 && b !=-1) {
			System.out.println("Condition 1 and 2 are satisfied.");
		}
		
		
		if (a != -1 && b != -1 && (y) % 3 == 0) {
			 
			  System.out.println("Condition 1 and 2 and 3 are satisfied.");
			 
			  
			  String protein = dna1.substring(a,b+3);
			  
			  
			  
			}else {
				System.out.println("No protein.");
			}
		
		
		
		
		
		
		
		
	}
		
}