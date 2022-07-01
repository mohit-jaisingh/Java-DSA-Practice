package javaBasics2_PracticeProblems;

public class SumArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,5,6,8,7,4,2,3,6,9,8,4,2,5,4,5,47};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+= a[i];
		}
		
		System.out.println("Sum = " + sum);
		
	}

}
