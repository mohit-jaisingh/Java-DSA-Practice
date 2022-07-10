package arrays3_PracticeProblems;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithEqual0sAND1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,1,0,0,1,1,1,1,0,0,1,1,1,0};
		// pSum[] = {-1,0,1,0,-1,0,1,2,3,2,1,2,3,4,3}
		
		System.out.println("longestLength = " + findLargestSubarray(arr));

	}
	
	static int findLargestSubarray(int[] a) {
		
	
		int[] prefixSum = new int[a.length];
		
		prefixSum[0] = a[0]==0? -1 : 1;  // set 0th prefixSum as -1 if a[0] is 0, else 1;
		
		for(int i=1; i<a.length; i++) { // continue filling prefix sum array
			if(a[i]==0) prefixSum[i] += prefixSum[i-1]-1;
			else prefixSum[i]+= prefixSum[i-1] + a[i];
		}
		
//		System.out.println("Prefix Sum");
//		for(int e: prefixSum) {
//			System.out.print(e + " ");
//		}
//		System.out.println();
		
		Map<Integer,Integer> occurance = new HashMap<>();
		int maxLen = 0;
		int startIndex = 0;
		int endIndex = -1;
		
		for(int i=0; i<prefixSum.length; i++) { //store each first occuring unique prefixSum elements
			
			int curr = prefixSum[i];
			
			if(curr == 0) { // array uptil now has equal 0s and 1s.
				maxLen = i+1; // It will be  the greatest maxLen uptil now.
			}
			
			if(occurance.containsKey(curr)) {  // if repeating element is found (sub array with equal 0s and 1s is found)
				if(maxLen < i-occurance.get(curr)) {  // if the subarray's length is greater than maxLen
					maxLen = i-occurance.get(curr); // update max len
					endIndex = i;
				}
			}else {
				occurance.put(curr, i); // add elements not present in PrefixSum along with index
										// at which it was found.
			}
			
		}
		startIndex = endIndex-maxLen+1; //maxLen would be 1 lesser than actual maxLen
		System.out.println("index " + startIndex + " to " + endIndex);
		
		return maxLen;
	}

}
