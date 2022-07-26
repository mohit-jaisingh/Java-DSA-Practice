package binarySearch1_ClassProblems;

public class FindMedianOf2SortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {1,3,5,6,8,  9,11};
//		int[] b = {3,4,6,8,  9,13,15,17,19,25,29};
		int[] a = {2};
		int[] b = {1,3};
		//{1,3,3,4,5,6,6,8,8  ,9,9,11,13,15,17,19,25}
		System.out.println(findMedianSortedArrays(a,b));
	}
	
	static double findMedianSortedArrays(int[] a, int[] b) { //O(log(min(n1,n2))) time.
		int n1 = a.length;
		int n2 = b.length;
		
		if(n1>n2) return findMedianSortedArrays(b,a);
		
		int l = 0;
		int r = n1;
		// n1 = 7
		// n2 = 11
		
		//m1 = 3
		//m2 = 6
		while(l<=r) {
			int m1 = l + (r-l)/2;
			int m2 = (n1+n2+1)/2 -m1;
			System.out.println("m1=" +  m1 + " " + "m2=" + m2);
			int max1 = m1==0? Integer.MIN_VALUE : a[m1-1];
			int max2 = m2==0? Integer.MIN_VALUE : b[m2-1];
			System.out.println("max1 = " + max1 + "max2 = " + max2);
			int min1 = m1==n1 ? Integer.MAX_VALUE : a[m1];
			int min2 = m2==n2 ? Integer.MAX_VALUE : b[m2];
			System.out.println("Mins" +  min1 + " " + min2);
			if(max2 <= min1 && max1 <= min2) {
				if((n1+n2) % 2 ==0) {
					return (Math.max(max1, max2) + Math.min(min1, min2))/2.0;
				}else {
					return Math.max(max1, max2);
				}
			}else {
				if(max2 > min1) {
					l = m1+1;
				}else if(max1 > min2) {
					r = m1-1;
				}
			}
		}
		return 0.0;
	}

}
