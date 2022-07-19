package backtracking_ClassProblems;

public class NQueenProblem {
	//Given an array of N*N, chekc if N queens can be placed without them killing each other.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int[][] a = new int[n][n];
		
		NQueen(a,n,0);
		
		for(int[] array : a) {
			for(int e : array) {
				System.out.print(e+ " ");
			}
			System.out.println();
		}

	}
	
	static boolean isSafe(int[][] a, int n, int row, int col) {
		
		for(int i=0; i<row; i++) {
			if(a[i][col] == 1) return false; // queen present in same column in some other row.
		}
		
		for(int i = row, j = col; i >= 0 && j >= 0; i--,j--) {//check left upper diagonal
			if(a[i][j] == 1) return false;
		}
		
		for(int i=row, j=col; i>=0 && j<n; i--,j++) { // check right upper diagonal
			if(a[i][j] == 1) {
				return false;
			}
		}
		
		return true;
		
	}
	
	static boolean NQueen(int[][] a, int n, int row) {
		
		if(row==n) return true; //all rows have queens, problem solved.
		
		for(int col=0; col<n; col++) { //checking which column is safe 
			if(isSafe(a,n,row,col)) { // is current column safe for current row
				a[row][col] = 1; //if yes, then place queen here
				if(NQueen(a,n,row+1)) { //check for next row.
					return true;//if can keep, return true.
				}
				a[row][col] = 0; // if not, then remove queen from current col in and try for next col.
				//backtracking
			}
		}
		
		return false;
	}

}
