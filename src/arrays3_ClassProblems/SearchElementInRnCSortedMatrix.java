package arrays3_ClassProblems;

public class SearchElementInRnCSortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {
				{1, 4, 5, 7},
				{2, 5, 6, 9},
				{6, 10, 11, 13},
				{8, 12, 15, 18}
		};
		
		System.out.println(searchInSortedMatrix(a, 8));

	}
	
	static boolean searchInSortedMatrix(int[][] m, int key) { //O(m+n) time, O(1) space.
		int r = 0;
		int c = m[0].length-1; //last column, first row.
		
		while(r<m.length && c >=0) { 
			if(m[r][c] == key) {	//check with last column, first row element, 
				return true;
			}else if(m[r][c]<key) { // if its lesser than key, goto next row.
				r++; 
			}else c--;  //if it is greater than key, move back column.
		}
		
		return false;
	}

}
