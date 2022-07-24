package bitManipulation_1_ClassProblems;

public class FindThe_ith_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(findIthBit(n, 1));
		PrintBinaryNumber.printBinary(5);
	}
	
	static int findIthBit(int n, int i) { //0 based from right side.
		int mask = 1<<i;
	
		int ans = n&mask;
		if(ans == 1) return 1;
		return 0;
		
	}

}
