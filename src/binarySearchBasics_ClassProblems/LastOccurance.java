package binarySearchBasics_ClassProblems;

public class LastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,3,5,5,5,7,9,10,11,11,11,11,12};
		System.out.println(lastOccurance(a, 15));

	}
	
	static int lastOccurance(int[] arr, int key) {
		int ans = -1;
		
		int l = 0;
		int r = arr.length-1;
		
		while(r>=l) {
			int mid = l + (r-l)/2;
			if(arr[mid] == key) {
				ans = mid;
//				System.out.println("found ans = " + ans);
				l = mid+1;
			}
			
			else if(key > arr[mid]) l = mid+1;
			else r = mid-1;
		}
		
		return ans;
		
	}

}
