package arrays1_ClassProblems;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sortedArr[] = {1,2,2,3,4,4,4,5,5,6,7,7,9,9,};
		int size = removeDuplicates(sortedArr);
		
		for(int i=0; i<size; i++) {
			System.out.print(sortedArr[i] + " ");
		}
		
	}
	
	public static int removeDuplicates(int sortedArr[]) {
		int del =0;
		
		for(int i=1; i<sortedArr.length; i++) {
			if(sortedArr[i] == sortedArr[i-1]) {
				del++;
			}else {
				sortedArr[i-del] = sortedArr[i];
			}
		}
		
		return sortedArr.length - del;
	}

}
