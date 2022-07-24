package bitManipulation_1_ClassProblems;

public class ChenckNumIsPowOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowOf2(8));
	}
	
	static boolean isPowOf2(int n) {
		
		return (n & n-1) == 0;  //1000 & 0111 for 8 & 7
	}

}
