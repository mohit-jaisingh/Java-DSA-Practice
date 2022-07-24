package bitManipulation_1_PracticeProblems;

public class CheckOddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		System.out.println(checkOddOrEven(n));
	}
	
	static String checkOddOrEven(int n) {
		
		if((n & 1) == 1) return "odd"; //checking 1st bit from right.
		
		return "even"; // 0 is also even;
	}

}
