package recursion_PracticeProblems;

public class CheckIfArrayIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,2,1};
		System.out.println(isPalindrome(a, 0, a.length-1));
	}
	
	static boolean isPalindrome(int[] a, int start, int end) {
		if(start>=end) {
			return true;
		}
		if(a[start]==a[end]) {
//			System.out.println("start = " + a[start] + "end = " + a[end]);
			return isPalindrome(a,start+1,end-1);
		}else return false;
	}

}
