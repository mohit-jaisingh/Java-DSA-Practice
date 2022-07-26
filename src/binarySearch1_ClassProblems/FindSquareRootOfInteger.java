package binarySearch1_ClassProblems;

public class FindSquareRootOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		System.out.println(findSquareRoot(n));
	}
	
	static int findSquareRoot(int n) {
		int l = 1;
		int r = n/2;
		
		while(l<=r) {
			int mid = l + (r-l)/2;
			if(mid*mid ==n) return mid;
			
			if(mid*mid >n) {
				r = mid-1;
			}else if(mid*mid <n) {
				l = mid+1;
			}
		}
		return -1;
	}

}
