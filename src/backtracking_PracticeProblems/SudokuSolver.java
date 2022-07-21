package backtracking_PracticeProblems;

public class SudokuSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{'5','3','.','.','7','.','.','.','.'},
				            {'6','.','.','1','9','5','.','.','.'},
				            {'.','9','8','.','.','.','.','6','.'},
				            {'8','.','.','.','6','.','.','.','3'},
				            {'4','.','.','8','.','3','.','.','1'},
				            {'7','.','.','.','2','.','.','.','6'},
				            {'.','6','.','.','.','.','2','8','.'},
				            {'.','.','.','4','1','9','.','.','5'},
				            {'.','.','.','.','8','.','.','7','9'}};
		
		solveSudoku(board);
		}
	
	static void solveSudoku(char[][] board) {
		if(helper(board,0,0)) {
			for(char[] row : board) {
				for(char e : row) {
					System.out.print(e + " ");
				}
				System.out.println();
			}
		}else System.out.println("Solution cannot be found");

	}
	
	static boolean isSafe(char[][] board, int row, int col, char e) {
		
		for(int i=0; i<board.length; i++) {
			if(board[row][i] == e) { //check all cols
				return false;
			}
			if(board[i][col] == e) { //check all rows
				return false;
			}
		}
		
		//check grid
		int sr = (row/3) * 3; //starting row of current grid
		int sc = (col/3) * 3; //starting col of current grid
		
		for(int i=sr; i<sr+3; i++) {
			for(int j=sc; j<sc+3; j++) {
				if(board[i][j] == e) {
					return false;
				}
			}
		}
		
		return true;
		
	}
	
	static boolean helper(char[][] board, int row, int col) {
		
		if(row == board.length) return true; //base case (sudoku is solved)
		
		int newRow = 0;
		int newCol = 0;
		
		if(col!= board.length-1) {
			newRow = row;
			newCol = col+1;
		}else {
			newRow = row+1;
			newCol = 0;
		}
		
		if(board[row][col] != '.') {
			if(helper(board,newRow,newCol)) {
				return true;
			}
		}else {
				for(int i=1; i<=9; i++) {
					if(isSafe(board,row,col,(char)(i+'0'))) {
						board[row][col] = (char) (i+'0');
						if(helper(board,newRow,newCol)) {
							return true;
						}else {
							board[row][col] = '.';
						}
						
					}
				}
			}
		
		return false;
	}

}
