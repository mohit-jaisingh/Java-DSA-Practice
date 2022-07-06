package arrays3_ClassProblems;

import java.util.HashSet;
import java.util.Set;

public class FindIfSubarrayWith0SumPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2,3,1,-4,3,2};
		
		System.out.println(SubarrayZeroSumBrute(a));
		System.out.println(SubarrayZeroSumOP(a));
	}
	
	static boolean SubarrayZeroSumOP(int[] a) { //O(N) time. O(N) space
		
		boolean isPresent = false;
		
		int[] prefixSum = new int[a.length];
		prefixSum[0] = a[0];
		
		for(int i=1; i<a.length; i++) {
			prefixSum[i] = prefixSum[i-1] + a[i]; //make prefixSum
		}
		
		Set<Integer> set= new HashSet<>();
		
		for(int i=0; i<prefixSum.length; i++) { //check if there are repeating elements in prefixSum.
			if(set.contains(prefixSum[i])){
				isPresent = true;
				break;
			}else set.add(prefixSum[i]);
		}	
		return isPresent;
	}
	
	
	static boolean SubarrayZeroSumBrute(int[] a) { //O(N^2) time, O(1) space.
		boolean isPresent = false;
			for(int i=0; i<a.length; i++) {
				int sum = a[i];
				for(int j=i+1; j<a.length; j++) {
					if(sum==0) {
						isPresent = true;
						break;
					}
					sum+=a[j];
				}
			}
		
		return isPresent;
	}

}
