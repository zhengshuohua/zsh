public class VarParameterExercise{
	public static void main(String[]args) {
		HspMethodd t1 = new HspMethodd() ;
		t1.showScore("nan", 1,55); 
		System.out.print(t1.showScore("nan", 1,55));
	}
}
class HspMethodd{
	
		public String showScore(String name , double...scores) {
			double totalScore = 0;
			for(int i =0;i<scores.length;i++) {
				totalScore += scores[i];
			}
			return name + scores.length  + totalScore;
		}
	
}