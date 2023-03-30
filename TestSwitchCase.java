public class TestSwitchCase{
	public static void main(String[]args) {
		int grade = 10;
		
		switch (grade) 
		{
		case 10:
			System.out.println("成绩为优秀");
			
		case'B':
		case'C':
			System.out.println("成绩为良好");
			break;
		case'D':
			System.out.println("成绩为及格");
			break;
		default:
			System.out.println("未知等级");
		}
		System.out.println("等级是"+grade);
	}
}