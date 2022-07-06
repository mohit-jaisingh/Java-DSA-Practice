package arrays3_ClassProblems;

public class TransposeOfMatrix { //only possible for square matrix

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { {1,2,3},
						   {4,5,6}, 
						   {7,8,9}};
		
		transpose(matrix);
		
		for(int i=0; i<matrix.length; i++) {
			
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
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
