package bitManipulation_2_ClassProblems;

public class SwapTwoBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 8;
		System.out.println(swapTwoBits(k,3,1));
		
	}
	
	static int swapTwoBits(int a, int i, int j) {
		int mask1 = 1<<i;
		int mask2 = 1<<j;
		
		
		int ith = a&mask1;
		int jth = a&mask2;
		
		if(ith == jth) return a;
		
		a = a^mask1;
		a = a^mask2;
		
		return a;
	}

}
