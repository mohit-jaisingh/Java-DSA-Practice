package recursion2_PracticeProblems;

public class JosephusProblem {
//	N no. of people standing in curcle, waiting to be executed.
//	counting begins at some point & moves in a fixed direction.
//	In each step k-1 people are skipped(every kth person is executed).
//	The last remaining person is given freedom.
//	Find the position in initial array who will get freedom for a given value of k and n.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(josephus(7,3));
	}
	
	static int josephus(int n, int k) {
		if(n==1) return 1;
		else {
			return (josephus(n-1,k)+k-1)%n +1;
		}						
		//					calling for sub problem
		//							adjusting for 1 less element
										//adjusting for array overflow
											//converting 0 based index to 1 based index.
	}
	
	

}
