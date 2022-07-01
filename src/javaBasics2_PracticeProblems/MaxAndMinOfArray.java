package javaBasics2_PracticeProblems;

public class MaxAndMinOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int[] a= {-1,6,-7,-8,6,9,5,4,-8,7,10};
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
			if(a[i]<min) {
				min = a[i];
			}
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);

	}

}
