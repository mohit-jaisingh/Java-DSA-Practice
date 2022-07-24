package backtracking_PracticeProblems;

public class SubsetSum {
	//Subset sum problem is to find subset of elements that are selected from 
	//a given set whose sum adds up to a given number K. 
//	We are considering the set contains non-negative values. 
//	It is assumed that the input set is unique (no duplicates are presented).

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,5,7,2,6};
		int k = 11;
			System.out.println(findSubsetSum(a , k));
	}
	
	static boolean findSubsetSum(int[] a, int k) {
		return isSubsetPossible(a,0, k);
	}
	
	static boolean isSubsetPossible(int[] a , int index, int k) {
		if(k<0) return false;
		if(k==0) return true;
		if(index >= a.length) return false;
		
		return isSubsetPossible(a,index+1,k) || 
				isSubsetPossible(a, index+1, k-a[index]);
		
	}

}
