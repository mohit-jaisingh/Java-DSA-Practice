package bitManipulation_1_ClassProblems;

public class ToggleIthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 65;
		int i = 2;
		int ans = toggleIthBit(n,i);
		System.out.println(ans);
		PrintBinaryNumber.printBinary(n);
		System.out.println();
		PrintBinaryNumber.printBinary(ans);
	}
	
	static int toggleIthBit(int n, int i) {
		 
		int mask = 1<<i;
		
		return n^mask;
//		System.out.println(ans);
	}

}
