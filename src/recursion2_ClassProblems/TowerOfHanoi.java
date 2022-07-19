package recursion2_ClassProblems;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moveDiscs(4,'A','C','B');
	}
	
	static void moveDiscs(int n, char from, char to, char aux) {
		if(n==0) return;
		
		moveDiscs(n-1,from,aux,to);
		System.out.println("Move " + n + " from " + from + " to " + to);
		moveDiscs(n-1,aux,to,from);
	}

}
