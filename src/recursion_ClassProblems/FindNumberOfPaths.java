package recursion_ClassProblems;

public class FindNumberOfPaths { // find paths from (0,0) to (n-1,n-1) for NxM matrix
	//Rule : we can only travel right or down.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findNumberOfPaths(2, 2)); //N x M matrix
	}
	
	static int findNumberOfPaths(int n, int m) { //O(2^N) time.
		
		if(n==1 || m==1) { //last row reached / last column reached
			return 1;
		}
		return findNumberOfPaths(n-1,m) + findNumberOfPaths(n,m-1);	
	}

}
