package binarySearchBasics_ClassProblems;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,3,5,5,5,7,9,10,11,11,11,11,12};
		System.out.println(countOccurance(a, 0));

	}
	
	static int countOccurance(int[] arr, int key) {
		int firstOccurance = -1;
		int lastOccurance = -1;
		
		int l = 0; 
		int r = arr.length-1;
		
		while(r>=l) { //first Occurance
			int mid = l + (r-l)/2;
			
			if(arr[mid] == key) {
				firstOccurance = mid;
				r = mid-1;
			}else if(key > arr[mid]) l = mid+1;
			else r = mid-1;
		}
		l=0;
		r = arr.length-1;
		while(r>=l) {
			int mid = l + (r-l)/2;
			
			if(arr[mid] == key) {
				lastOccurance = mid;
				l = mid+1;
			}else if(key > arr[mid]) l = mid+1;
			else r = mid-1;
		}
		
		if(firstOccurance >=0 && lastOccurance >=0 ) {
			return lastOccurance-firstOccurance +1;
		}
		
		return 0;
	}

}
