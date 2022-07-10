package arrays3_PracticeProblems;

public class SplitArrayIn3EqualSumSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,3,6,5,-2,2,5,1,-9,4};
		
		System.out.println(splitIn3(arr));
	}
	
	static boolean splitIn3(int[] a) {
		
		int sum =0;
		
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		System.out.println(sum);
		if(sum%3 !=0) {
			return false;
		}
			
		
		int oneThird = sum/3;
		int partitions = 0;
		int curSum = 0;
		
		for(int i=0; i<a.length; i++) {
			curSum+=a[i];
			
			if(curSum == oneThird) {
				partitions++;
				curSum = 0;
			}
		}
		
		if(partitions == 3) {
			return true;
		}
		
		return false;
	}

}
