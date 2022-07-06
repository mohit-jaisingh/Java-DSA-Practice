package arrays3_ClassProblems;

public class RotateMatrix90Degrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = { {1 , 2, 3, 4}, 
						   {5 , 6, 7, 8}, 
						   {9 ,10,11,12},
						   {13,14,15,16} };
		System.out.println("Before Rotating");
		for(int i=0; i<matrix.length; i++) {
			
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("After Rotating");
		rotateMatrix90DegreeOP(matrix);
		
		for(int i=0; i<matrix.length; i++) {
			
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void rotateMatrix90DegreeOP(int[][] m) { //O(N/2 * N/2) time solution.
		int n = m.length;
		
		for(int i=0; i<n/2; i++) {   //graphical movement to its final place.
			for(int j=0; j<n/2; j++) {
				
				int temp = m[i][j];
				m[i][j] = m[n-j-1][i];
				m[n-j-1][i] = m[n-i-1][n-j-1];
				m[n-i-1][n-j-1] = m[j][n-i-1];
				m[j][n-i-1] = temp;
			}
		}
	}
	
	static void rotateMatrix90Degree(int[][] m) { 
		transpose(m);                       //Step 1: transpose
		int n = m.length;
		for(int i=0; i<n; i++) {		//Step 2: reverse every row.
			for(int j=0; j<n/2; j++) {
				int swap = m[i][j];
				m[i][j] = m[i][n-1-j];
				m[i][n-1-j] = swap;
			}
		}
	}
	
	static void transpose(int[][] matrix) { // swap upper triangular matrix with lower.
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=i; j<matrix.length; j++) { //traverse only from 11,22,33
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
				
			}
		}
	
	}


}
