package arrays1_PracticeProblems;

public class ThirdLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,9,7,6,4,25,35,9,25,45,50};
		System.out.println("Third largest element = " + thirdLargestElement(arr));
	}
	
	public static int thirdLargestElement(int[] arr) {
		int largest = 0;
		int second = -1;
		int third = -1;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[largest]) {
				third = second;
				second = largest;
				largest = i;
			}else {
				if(arr[i]>arr[second] || arr[second] == -1) {
					third = second;
					second =i;
				}else if(arr[i] > arr[third] || third == -1) {
					third =i;
				}
			}
		}
		
		return arr[third];
	}

}
