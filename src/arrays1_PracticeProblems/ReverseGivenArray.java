package arrays1_PracticeProblems;

public class ReverseGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,9,7,6,4,25,35,9,25,45,50};
		reverseArray(arr);
		for(int e: arr) {
			System.out.print(e + " ");
		}
		
	}
	
	public static void reverseArray(int[] arr) {
		int l = 0;
		int r = arr.length -1;
		
		while(l < r) {
			arr[l] = arr[l] ^ arr[r];  // gives l^r 
			arr[r] = arr[l] ^ arr[r]; // gives (l^r) ^ r = l
			arr[l] = arr[l] ^ arr[r]; // gives (l^r) ^ l = r
			
			l++;
			r--;
		}
	}

}
