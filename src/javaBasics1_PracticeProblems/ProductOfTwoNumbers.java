package javaBasics1_PracticeProblems;
import java.util.Scanner;
public class ProductOfTwoNumbers {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int prod = a*b;
		System.out.println("Product is = " + prod);
	}

}
