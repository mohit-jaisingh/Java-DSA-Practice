package binarySearchBasics_ClassProblems;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,5,7,9,10,11,12};
		System.out.println(binarySearch(a, 5));

	}
	
	static int binarySearch(int[] arr, int key) {
		
		int l = 0;
		int r = arr.length-1;
		
		while(r>=l) {
			int mid = l + (r-l)/2;
			
			if(arr[mid] == key) return mid;
			if(key > arr[mid]) l = mid+1;
			else r = mid-1;
		}
		
		return -1;
				
	}

}
