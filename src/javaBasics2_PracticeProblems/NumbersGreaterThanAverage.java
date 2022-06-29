package javaBasics2_PracticeProblems;

public class NumbersGreaterThanAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,1,3,9,5,4,7,6,2,8,4,5};
		int avg=0;
		for(int i=0; i<a.length; i++) {
			avg+=a[i];
		}
		avg/=a.length;
		System.out.println("average = " + avg);
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>avg) {
				System.out.print(a[i] + " ");
			}
		}
		

	}

}
