package javaBasics2_PracticeProblems;
import java.util.Scanner;
public class MultiplicationTableOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print multiplication table");
		int n = sc.nextInt();
		int multiple = 1;
		while(multiple <=10) {
			System.out.println(n + " x " + multiple + " = " + n*multiple);
			multiple++;
		}
		
		sc.close();

	}

}
