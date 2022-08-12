package bitManipulation_2_ClassProblems;

public class Reverse32BitsUnsignedInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 10505681;
		System.out.println(reverseBits(n));
	}
	
	static long reverseBits(long n) { //long is 64 bit, we do it to keep 31st bit unsigned.
		
		for(int i=0; i<16; i++) {
			n = swap(n,i,31-i);
		}
		
		return n;
	}
	
	static long swap(long n, int i, int j) {
		long mask1 = 1L<<i; //important to put L
		long mask2 = 1L<<j;
		
		long ith = n&mask1;
		long jth = n&mask2;
		
		if(ith == jth) return n;
		
		n = n ^ mask1;
		n = n ^ mask2;
		
		return n;
	}

}
