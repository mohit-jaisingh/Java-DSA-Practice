package arrays2_ClassProblems;

public class MaxSumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,-7,4,-2,1,5,-4};
		
		maxSumSubarray(arr);
	}
	
	static void maxSumSubarray(int[] a) {
		int maxSum = Integer.MIN_VALUE; //array has negative values, so if all are negative, least negative will be stored.
		int curSum = 0;
		
		int from = 0;
		int to = -1;
		
		for(int i=0; i<a.length; i++) {
			curSum+= a[i];
			if(curSum<0) {
				curSum =0;
				from = i+1;
			}
			
			if(curSum>maxSum) {
				maxSum = curSum;
				to = i;
			}
		}
		
		System.out.println("maxSum = " + maxSum);
		System.out.println("Subarray is : ");
		
		for(int i=from; i<=to; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
