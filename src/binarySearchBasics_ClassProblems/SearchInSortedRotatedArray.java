package binarySearchBasics_ClassProblems;

public class SearchInSortedRotatedArray extends BinarySearch{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,5,6,7,8,9,10,1,2,3};
		System.out.println(searchInSortedRotatedOP(a, 1));
	}
	
	static int searchInSortedRotatedOP(int[] arr, int key) { //O(log n) time, O(1) space
		//*answer found in single binary search.
//		left sorted -Present   | left
//		left sorted -Abscent   | right
//		right sorted -Present  | right
//		right sorted -Abscent  | left
		
		int l = 0;
		int r = arr.length-1;
		
		while(r>=l) {
			
			int mid = l + (r-l)/2;
			if(arr[mid] == key) return mid;
			
			if(arr[mid] >= arr[l]) { //left sorted 
				if( key >= arr[l] && key < arr[mid]) { //-Present
					r = mid-1;
				}else {// -Abscent
					l = mid+1;
				}
			}else{ //right sorted
				
				if(key>arr[mid] && key<=arr[r]) { // -Present
					l = mid+1;
				}else { //Abscent
					r = mid-1;
				}	
			}	
		}
		
		return -1;
	}
	
	static int searchInSortedRotated(int[] arr, int key) { //O(log n) time, O(1) space
															// *double times binary search
		int l = 0;
		int r = arr.length-1;
		
		int pivot = -1;
		
		while(r>=l) { //find pivot    //*once for finding pivot
			int mid = l + (r-l)/2;
			
			if(arr[mid] > arr[mid+1]) {
				pivot = mid;
				break;
			}else {
				if(arr[mid] >= arr[l]) {
					l = mid+1;
				}else {
					r = mid-1;
				}
			}
		}
		
		l=0;
		r = arr.length-1; // *then for finding the element
		
		if(key >= arr[l] && key <= arr[pivot]) { //is element likely in left array or right(from pivot)
			r = pivot;   //set the searchable array accordingly
		}else {
			l = pivot+1;
		}
		
		while(r>=l) { //search in the likely part of the matrix
			int mid = l + (r-l)/2;
			
			if(arr[mid] == key) {
				return mid;
			}
			if(key > arr[mid]) l = mid+1;
			else r = mid-1;
		}
		
		return -1;
	}

}
