package arrays1_PracticeProblems;

public class SmallestElementInaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,9,7,6,4,25,35,9,25,45,50};
		
		System.out.println("smallest element is " + findSmallest(arr));
	}
	
	public static int findSmallest(int[] arr) {
		int smallest = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		
		return smallest;
	}

}
