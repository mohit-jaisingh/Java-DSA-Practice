package javaBasics1_PracticeProblems;
import java.util.Scanner;
public class AreaAndPerimeterOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter radius of Circle");
		
		double r = sc.nextDouble();
		double pi = 22/7.0;
		double perimeter = 2*pi*r;
		double area = pi*r*r;
		
		
		System.out.println("The area of circle with radius " + r + " is = " + area);
		System.out.println("The perimeter of circle with radius " + r + " is = " + perimeter);
		sc.close();

	}

}
