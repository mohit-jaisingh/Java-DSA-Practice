package javaBasics2_PracticeProblems;


public class FindSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findSmallestOf3(5,3,4));

	}
	
	public static int findSmallestOf3(int a, int b, int c) {
		
		if(a<b) {
			if(a<c) {
				return a;
			}else {
				return c;
			}
		}else {
			if(b<c) {
				return b;
			}
			return c;
		}
	}

}
