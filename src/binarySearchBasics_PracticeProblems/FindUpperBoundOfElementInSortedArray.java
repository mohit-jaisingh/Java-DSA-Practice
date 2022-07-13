package binarySearchBasics_PracticeProblems;

public class FindUpperBoundOfElementInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,5,7,8,9,10,15,20,50};
		int index = findIndexOfUpperBound(a, 0);
		
		if(index>-1) {
			System.out.println(a[index]);
		}else System.out.println("not found");

	}
	
	static int findIndexOfUpperBound(int[] arr, int k) {
		int l = 0;
		int r = arr.length-1;
		int ans = -1;
		
		while(r>=l) {
			int mid = l + (r-l)/2;
			
			if(arr[mid] >k && (ans==-1 || arr[mid] < arr[ans])) {
				ans = mid;
				r = mid-1;
			}else {
				l = mid+1;
			}
		}
		
		return ans;
	}

}
