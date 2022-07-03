package arrays1_PracticeProblems;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,5,6,8,9};
		int[] arr2 = {1,3,5,4,9,15};
		
		System.out.println(isArraySorted(arr1));
		System.out.println(isArraySorted(arr2));
	}
	
	public static boolean isArraySorted(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		
		return true;
	}

}
