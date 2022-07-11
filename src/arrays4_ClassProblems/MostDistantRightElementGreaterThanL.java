package arrays4_ClassProblems;


public class MostDistantRightElementGreaterThanL {
	
	public static void main(String args[]) {
		
		int a[] = {5,4,1,7,2,8,6,3,4};
		System.out.println(findMostDistantRightElementGreaterThanLeft(a));
		
	}
	
	//Brute for is to check ith and jth =i+1 element in nested loop for all combinations.
	
	//Optimized using space and two pointer(both starting from right)
	static int findMostDistantRightElementGreaterThanLeft(int[] a) { //O(N) time, O(2N) space;
		int n = a.length;
		int[] rightMax = new int[n];
		int[] leftMin = new int[n];
		
		leftMin[0] = a[0];
		
		for(int i=1; i<n; i++) {
			if(a[i] < leftMin[i-1]) {
				leftMin[i] = a[i];
			}else leftMin[i] = leftMin[i-1];
		}
		
		rightMax[n-1] = a[n-1];
		
		for(int i=n-2; i>=0; i--) {
			if(a[i] > rightMax[i+1]) {
				rightMax[i] = a[i];
			}else rightMax[i] = rightMax[i+1];
		}
		
//		for(int e : leftMin) {
//			System.out.print(e + " ");
//		}
//		System.out.println();
//		for(int e : rightMax) {
//			System.out.print(e + " ");
//		}
//		System.out.println();
		
		int ans = 0;
		
		int i = n-1; //leftMin
		int j = n-1;//rightMax
		
		while(i>=0 && j>=0) {
			if(rightMax[j] > leftMin[i]) {
				ans = Math.max(ans, (j-i));
				//System.out.println(ans);
				i--;
			}else if(rightMax[j] <= leftMin[i]) {
				j--;
			}
		}
		
		return ans;
	}

}
