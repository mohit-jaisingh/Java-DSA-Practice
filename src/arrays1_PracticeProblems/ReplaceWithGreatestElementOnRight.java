package arrays1_PracticeProblems;

public class ReplaceWithGreatestElementOnRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,5,8,9,6,8,5,7,4,6};
		
		replaceWithGreatestOnRight(arr);
		
		for(int e: arr) {
			System.out.print(e + " ");
		}

	}
	
	public static void replaceWithGreatestOnRight(int[] arr) {
		int n = arr.length-1;
		int max = 0;
		
		for(int i = n; i>=0; i--) {
			int curr = arr[i];
			
			arr[i] = max;
			
			if(curr > max) {
				max = curr;
			}
		}
	}

}
