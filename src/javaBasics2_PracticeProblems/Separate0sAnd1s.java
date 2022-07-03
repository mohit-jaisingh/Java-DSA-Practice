package javaBasics2_PracticeProblems;

public class Separate0sAnd1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,0,0,0,1,1,1,0,0,1,0,1,0,0,0};
		int l=0, r =a.length-1;
		
		while(l<r) {
			if(a[r]==0) {
				if(a[l]==1) {
					int temp = a[l];
					a[l] = a[r];
					a[r] = temp;
					r--;
					l++;
				}else {
					l++;
				}
			}else r--;
		}
		
		for(int e: a) {
			System.out.print(e + " ");
		}
	}

}
