package recursion2_ClassProblems;

public class FindTheSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SumOfDigits(123));
	}
	
	static int SumOfDigits(int a) { //O(log N) time, O(log N) space.  (log is base 10)
		if(a==0) {
			return 0;
		}
		
		return (a%10) + SumOfDigits(a/10);
	}

}
