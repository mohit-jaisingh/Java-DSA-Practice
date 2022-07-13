package binarySearchBasics_PracticeProblems;

public class FindIndexOfElementOrWhereItWouldBeIfInserted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,4,5};
		System.out.println(findIndex(a, -15));

	}
	
	static int findIndex(int[] arr, int k) {
		int index = -1;
		
		int l = 0;
		int r = arr.length-1;
		
		while(r>=l) {
			int mid = l + (r-l)/2;
			
			if(arr[mid] == k ) {
				index = mid;
				return index;
			}
			
			if(arr[mid] > k) {
				if(mid==0) return mid; //first element is greater than k
				if(arr[mid-1]<k) { //prev element is greater than k
					return mid;
				}
				r = mid-1;
			}else { //mid < k
				if(mid==arr.length-1) return arr.length; //last element is lesser than k
				if(arr[mid+1] >k) return mid+1; //next element is greater than k.
				l = mid+1;
			}
		}
		return index;
	}

}
