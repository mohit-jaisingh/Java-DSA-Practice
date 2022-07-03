package javaBasics1_PracticeProblems;
import java.util.Scanner;
public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("Numbers after swapping " + num1 + " , " + num2);
		sc.close();
	}

}
