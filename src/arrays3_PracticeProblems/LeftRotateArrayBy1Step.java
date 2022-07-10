package arrays3_PracticeProblems;

public class LeftRotateArrayBy1Step {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		leftRotateArray1step(arr);
		
		for(int e : arr) {
			System.out.print(e + " ");
		}
	}
	
	static void leftRotateArray1step(int[] a) {
		
		int temp = a[0];
		
		for(int i=0; i<a.length-1; i++) {
			a[i] = a[i+1];
		}
		
		a[a.length-1] = temp;
	}

}
