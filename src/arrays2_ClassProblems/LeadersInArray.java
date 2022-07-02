package arrays2_ClassProblems;

public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,7,6,1,4,3};
		leadersInAnArray(arr);
	}
	
	static void leadersInAnArray(int[] arr) {
		int n = arr.length;
		int leaders[] = new int[n];
		int j=0;
		
		int max = Integer.MIN_VALUE;
		
		for(int i=n-1; i>=0; i--) {
			if(arr[i]>max) {
				max = arr[i];
				leaders[j++] = arr[i];
			}
		}
		
		for(int i=j-1; i>=0; i--) {
			System.out.print(leaders[i] + " ");
		}
	}

}
