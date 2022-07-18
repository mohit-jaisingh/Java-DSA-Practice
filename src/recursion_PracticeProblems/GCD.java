package recursion_PracticeProblems;

public class GCD {
	public static void main(String[] args) {
		System.out.println(findGCD(10,15));
	}
	
	static int findGCD(int a, int b) {
		
		if(a==0) {
			return b;
		}
		
		return findGCD(b%a, a); // can be done by (b-a) as well,but need to handle a>b
		//b%a is faster.
	}
}
