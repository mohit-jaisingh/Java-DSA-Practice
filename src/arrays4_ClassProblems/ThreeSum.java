package arrays4_ClassProblems;

import java.util.Arrays;

public class ThreeSum extends TwoSum{ //find 3 numbers in an unsorted Array with given sum

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,4,7,3,5,-2,1};
		int sum = 5;
		
		System.out.println(threeSum(a,sum));

	}
	
	//Brute force is to have nested loop of 3 and check if that combo gives the sum.
	
	//optimized is to take ith element and then find TwoSum such that TwoSum + ith = sum.
		
		
	
	static boolean threeSum(int[] a, int sum) {
		
		Arrays.sort(a); // O(NlogN);
		
		for(int i=0; i<a.length; i++) {
			if(TwoSum.findTwoSum(a, sum-a[i],i+1)) {
				//System.out.println(" k = " + a[i]);
				return true;
			}
		}
		
		return false;
	}
	
}
