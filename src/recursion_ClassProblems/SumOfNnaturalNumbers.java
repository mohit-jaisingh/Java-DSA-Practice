package recursion_ClassProblems;

public class SumOfNnaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfNnaturalNumbers(5));
	}
	
	static int sumOfNnaturalNumbers(int n) {
		if(n==0) {
			return n;
		}
		
		return n + sumOfNnaturalNumbers(n-1);
	}

}
