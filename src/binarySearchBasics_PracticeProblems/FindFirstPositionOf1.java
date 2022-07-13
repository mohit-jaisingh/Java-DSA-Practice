package binarySearchBasics_PracticeProblems;

public class FindFirstPositionOf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,0,0,0,1,1,1,1};
		System.out.println(findFirstPositionOf1(a));
	}
	
	static int findFirstPositionOf1(int[] arr) {
		int ans = -1;
		int l=0; 
		int r=arr.length-1;
		
		while(r>=l) {
			int mid = l + (r-l)/2;
			System.out.println("mid = " + mid + " " + arr[mid]);
			if(arr[mid] == 1) {
				ans = mid;
				r = mid-1;
			}else l = mid+1;
			
		}
		
		return ans;
	}

}
