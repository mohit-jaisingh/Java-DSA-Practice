package bitManipulation_1_ClassProblems;

public class CountNoOfSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 32;
		System.out.println(countSetBits(n));
	}
	
	static int countSetBits(int n) {
		int count = 0;
		while(n!=0) {
			if((n & 1) == 1) {
				count ++;
			}
			n = (n>>1);
		}
		return count;
	}

}
