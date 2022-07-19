package backtracking_ClassProblems;

public class RatInAMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { {1,1,0,1},
				      {1,1,1,1},
				      {1,0,1,1},
				      {1,1,0,1}
					};
		boolean viz[][] = new boolean[a.length][a.length];
		
		System.out.println(ratInAMaze(a, viz, 0, 0));
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a.length; j++) {
//				System.out.print(viz[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
	
	
	static boolean ratInAMaze(int a[][], boolean viz[][], int i, int j) {
		
		int n = a.length;
		//Base Conditions
		if(i == n || j == n || a[i][j] == 0) {
			return false;
		}
		//Base condition when successfully reached
		if(i== n-1 && j == n-1) {
			viz[i][j] = true;
			return true;
		}
		
		viz[i][j] = true; //mark current position visited
		
		//is path possible from down
		if(ratInAMaze(a, viz, i+1, j)) return true; 
		
		//is path possible from right
		if(ratInAMaze(a,viz,i,j+1)) return true;
		
		//if no path found from right or down, dont visit current
		viz[i][j] = false; 
		return false;
	}

}
