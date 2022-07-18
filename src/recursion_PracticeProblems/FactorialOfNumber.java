package recursion_PracticeProblems;

import java.math.BigInteger;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(20)); //max 20! can be calculated for Long
		System.out.println(Long.MAX_VALUE);
		System.out.println(bigFactorial(280));
	}
	
	static BigInteger bigFactorial(int n) { //can theoretically calculate anything
		//do not use recursion as it will cause stack overflow.
		BigInteger factorial = BigInteger.ONE;
		
		for(int i=n; i>0; i--) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		
		return factorial;
		
	}
	
	static long factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}

}
