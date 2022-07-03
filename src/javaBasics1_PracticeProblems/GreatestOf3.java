package javaBasics1_PracticeProblems;
import java.util.Scanner;
public class GreatestOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 3 numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}else System.out.println(c);
		}else if(b>c) {
				System.out.println(b);
			}else System.out.println(c);
		
		sc.close();
	}

}
