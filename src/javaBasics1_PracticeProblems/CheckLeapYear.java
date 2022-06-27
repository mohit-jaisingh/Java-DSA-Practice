package javaBasics1_PracticeProblems;
import java.util.Scanner;
public class CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year%100 == 0) {
			if(year%400 == 0) {
				System.out.println("Leap Year");
			}else {
				System.out.println("Not a leap Year");
			}
		}else if(year%4 == 0){
			
			System.out.println("Leap Year");
		}else {
				System.out.println("Not a leap Year");
		} sc.close();
		
	}
	

}
