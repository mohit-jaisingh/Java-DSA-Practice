package bitManipulation_1_PracticeProblems;

public class Set_ith_Bit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 35;
		int ans = setIthBitTo1(n, 4);
		System.out.println(ans);
		bitManipulation_1_ClassProblems.PrintBinaryNumber.printBinary(n);
		System.out.println();
		bitManipulation_1_ClassProblems.PrintBinaryNumber.printBinary(ans);
		System.out.println();
		System.out.println(unSetIthBit(n, 4));
		
	}
	
	static int setIthBitTo1(int n, int i){
		int mask = 1<<i;
		if( (n & mask) == 0) { //if ith bit is 0
				n = n ^ mask;  //toggle ith bit
		}

		return n;
	}
	
	static int unSetIthBit(int n, int i) {
		int mask = 1<<i;
		
		if((n&mask) == 1) {
			n = n^mask;
		}
		
		return n;
	}

}
