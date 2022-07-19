package recursion2_PracticeProblems;

import java.util.Arrays;

public class RopeCuttingProblem {

	// given 3 lengths p,q,r and total rope length as l, find the max no of ropes that can be cur.
	//Rule: full length of rope should be used, all ropes should be of eith p,q, or r length.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = 11;
		int p = 2;
		int q = 3;
		int r = 5;

		int[] dp = new int[l+1];
		Arrays.fill(dp, -2);

		System.out.println(findMaxRopes(l, p, q, r)); //Using recursion.
	}
	
	static int findMaxRopes(int l, int p, int q, int r) { //O(3^N) time.
		if(l==0) return 0; //base cases
		if(l<0) return -1;
		
		int a = findMaxRopes(l-p, p, q, r); //check if we can cut with p
		int b = findMaxRopes(l-q, p, q, r); //check if we can cut with q
		int c = findMaxRopes(l-r, p, q, r);//check if we can cut with r
		
		int ans = Math.max(a, Math.max(b, c)); // we are choosing one amongst the 3 cuts from a,b,c whichever gives max, then calling sub problem.
		if(ans == -1) { //cannot cut with p,q,or r. all 3 return -1;
			return -1;
		}
		return ans + 1; //adding current cut(1) after ans from subproblems received.
	}

	static int findMaxRopesOP(int l, int p, int q, int r,int[] dp) { //O(N) usin DP -> DP is recursion with memory.
		if(l==0) return dp[l] = 0;
		if(l<0) return -1;

		if(dp[l] != -2) return dp[l]; //If already calculated for length l, return that, no need to calculate again.

		int a=0,b=0,c=0;

		a = findMaxRopesOP(l-p,p,q,r,dp);
		b = findMaxRopesOP(l-q, p, q, r,dp);
		c = findMaxRopesOP(l-r, p, q, r,dp);

		System.out.println("Max = " + Math.max(a, Math.max(b, c)));
		int ans = Math.max(a, Math.max(b, c));

		if(ans ==-1) return dp[l] = ans; //save the ans in dp array

		return dp[l] = ans + 1; // save and return ans + 1 . we add +1 to the ans of the subproblem.
	}

}
