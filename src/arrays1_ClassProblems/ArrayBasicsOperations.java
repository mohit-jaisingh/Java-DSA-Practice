package arrays1_ClassProblems;

public class ArrayBasicsOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,7,9,4,6,1,2,8};
		
		
		int index = searchElement(arr,11);  //search
		if(index<0) System.out.println("Element not found");
		else System.out.println("Element found at " + index + " index");
		
		System.out.println("Array before deletion"); //deletion
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nAfter deletion");
		int sizeAfterDeletion = deleteElement(arr, 2);
		//System.out.println(sizeAfterDeletion);
		for(int i=0; i<sizeAfterDeletion; i++) {
			System.out.print(arr[i] + " ");
		}
		int arr1[] = {1,3,5,7,9,4,6,1,2,8};
		
		System.out.println("\n Largest element is " + largestElement(arr1));
		System.out.println("\n Second largest element is " + secondLargest(arr1));
				

	}
	
	public static int searchElement(int[] arr, int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static int deleteElement(int[]arr , int key) { //returns size after deletion
		int i=0;
		int n = arr.length;
		for(; i<n; i++) {
			if(arr[i] == key) {
				break;	//break when found.
			}
		}
		if(i==n) return n;
		while(i<n-1) { //shift all the elements to its right one step left.
			arr[i] = arr[i+1];
			i++;
		}
		return n-1; //new size
		
	}
	
	public static int largestElement(int arr[]) {
		int largest = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		return largest;
	}
	
	public static int secondLargest(int arr[]) {
		int largest = 0; //index
		int second = -1;// index
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[largest]) {
				second = largest;
				largest = i;
			}
			
			else if(arr[i] < arr[largest]) {
				if(arr[i] > arr[second] || second == -1) {
					second = i;
				}
			}
		}
		
		return arr[second];
	}

}
