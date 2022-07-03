package javaBasics2_PracticeProblems;
import java.util.Scanner;
public class FindFactorialOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		System.out.println("factorial of " + n + " = " + findFactorial(n));
		System.out.println("recursive factorial of " + n + " = " + findFactorial(n));
		

	}
	
	public static int findFactorial(int n) {
		int fac =1;
		
		if(n==0 || n ==1) {
			return fac;
		}
		
		for(int i=n;i>1; i--) {
			fac*= i;
		}
		
		return fac;
	}
	
	public static int findFactorialRecursive(int n) {
		if(n==0||n==1) {
			return 1;
		}
		
		return n * findFactorialRecursive(n-1);
	}

}
