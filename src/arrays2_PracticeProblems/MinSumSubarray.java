package arrays2_PracticeProblems;

public class MinSumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-1,3,-6,2,1,-3,-5,8,3,-5,-9,-9};
		
		System.out.println(minSumSubarray(a));
	}
		
	
	static int minSumSubarray(int[] a) {
		int minSum = Integer.MAX_VALUE;
		int sum = a[0];
		
		int from = 0, to = -1;
		int finalFrom = from;
		
		for(int i=1; i<a.length; i++) {
			if(minSum>sum) {
				minSum = sum;
				to = i;
				finalFrom = from;
			}
			
			sum+=a[i];
			
			if(sum>0) {
				sum=0;
				from =i+1;
			}
		}
		
		System.out.println("from " + finalFrom + " index to " + to + " index");
		return minSum;
		
	}

}
