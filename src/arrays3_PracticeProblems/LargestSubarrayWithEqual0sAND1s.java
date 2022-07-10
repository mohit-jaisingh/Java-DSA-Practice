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
		
		prefixSum[0] = a[0]==0? -1 : 1;
		
		for(int i=1; i<a.length; i++) {
			if(a[i]==0) prefixSum[i] += prefixSum[i-1]-1;
			else prefixSum[i]+= prefixSum[i-1] + a[i];
		}
		
		System.out.println("Prefix Sum");
		for(int e: prefixSum) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		Map<Integer,Integer> occurance = new HashMap<>();
		int maxLen = 0;
		int startIndex = 0;
		int endIndex = -1;
		
		for(int i=0; i<prefixSum.length; i++) {
			
			int curr = prefixSum[i];
			if(curr == 0) {
				maxLen = i+1;
			}
			
			if(occurance.containsKey(curr)) {
				if(maxLen < i-occurance.get(curr)) {
					maxLen = i-occurance.get(curr);
					endIndex = i;
				}
			}else {
				occurance.put(curr, i);
			}
			
		}
		
		System.out.println("index " + (endIndex-maxLen+1) + " to " + endIndex);
		
		return maxLen;
	}

}
