package recursion_ClassProblems;

public class PrintNnaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNnaturalNumbers(5);
	}
	
	static void printNnaturalNumbers(int n) { //O(N) time ,O(N) space.
		//space is for recursive stack.
		if(n==0) { //base case
			return;
		}
		 
		printNnaturalNumbers(n-1); // call for subproblem
		
		System.out.print(n + " "); //some operation
	}

}
