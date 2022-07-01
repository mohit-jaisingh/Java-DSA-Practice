package javaBasics2_PracticeProblems;
import java.util.Scanner;
public class PrintFibonacciSeriesTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		int prev = 0;
		int current = 1;
		int next = prev+current;
		
		if(n==1) {
			System.out.println(prev);
		}else if(n==2) {
			System.out.println(prev +"/n" + current);
		}else {
			System.out.println(prev);
			while(n>1) {
				System.out.println(current);
				prev = current;
				current = next;
				next = prev+current;
				n--;
			}
		}
	}

}
