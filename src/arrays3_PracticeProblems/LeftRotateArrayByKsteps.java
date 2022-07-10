package arrays3_PracticeProblems;

public class LeftRotateArrayByKsteps {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int steps = 2;
		
		leftRotateKsteps(arr,steps);
		
		for(int e : arr) {
			System.out.print(e + " ");
		}
	}
	
	static void leftRotateKsteps(int[] a, int k) {
		
		int n = a.length;
		
		if(k == a.length || k == 0) return; // rotating k times when length = k returns same array.
		if(k>a.length) k -= a.length; // does the same thing.
		 
		int i = 0; // first we put the correct element in 0th index.
		int t1 = a[i]; //save the 0th element for later.
				
		a[i] = a[i+k]; // putting correct element
		
		int end = i+k; // continue loop till i reaches i+k;
		
		do {
			i = i-k;  //substitute each element with i - kth element
			if(i<0) i += n;  
			
			int temp = a[i]; //swapping the temp variable
			a[i] = t1;			// after putting current temp(t1) in its right place.
			t1 = temp;			
			
		}while(i!=end);

	}

}
