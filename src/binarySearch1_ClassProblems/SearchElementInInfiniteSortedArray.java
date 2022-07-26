package binarySearch1_ClassProblems;

public class SearchElementInInfiniteSortedArray {
	//we have infinite array, we cant use .length property to find length.
	//find the element in most optimized way.
	//Theoretical question
	//can search only in n/2 array.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,6,7,8,11,13,14,17,17,19,23,25,27,28,29,31,34,35,36};
		int key = 29;
		System.out.println(searchInInfiniteArray(a, key));
	}
	
	static int searchInInfiniteArray(int[] a,int key) {
		int range = 1;
		int foundIndex = -1;
		
		while(foundIndex<0) {
			System.out.println("range = " + range);
//			System.out.println(range);
			if(a[range] == key) {
				foundIndex = range;
			}else if(a[range] > key) {
				int from = range/2;
				while(from<range) {
					int mid = from + (range-from)/2;
					if(a[mid] == key) {
						foundIndex = mid;
						break;
					}else if(a[mid] > key) {
						range = mid-1;
					}else from = mid+1;
				}
				break;
			}else range*=2;
				
		}
		return foundIndex;
	}

}
