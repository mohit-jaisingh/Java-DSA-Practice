package javaBasics1_PracticeProblems;
import java.util.Scanner;
public class InchesToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double inches = sc.nextDouble();
		double meters = inches * 0.0254;
		
		System.out.println(meters + " m");
		sc.close();
	}

}
