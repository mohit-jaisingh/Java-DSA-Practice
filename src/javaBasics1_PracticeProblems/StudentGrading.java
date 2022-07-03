package javaBasics1_PracticeProblems;
import java.util.Scanner;
public class StudentGrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int marks = sc.nextInt();
		
		char grade;
		if(marks>=90) {
			grade = 'A';
		}else if(marks>=80){
			grade = 'B';
		}else if(marks>=70){
			grade = 'C';
		}else if(marks>=60){
			grade = 'D';
		}else if(marks>=50){
			grade = 'E';
		}else {
			grade = 'F';
		}
		System.out.println("Grade is " + grade);
		sc.close();
	}
}
