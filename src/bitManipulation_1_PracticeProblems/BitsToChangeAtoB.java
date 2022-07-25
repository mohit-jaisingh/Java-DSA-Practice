package bitManipulation_1_PracticeProblems;

public class BitsToChangeAtoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7; //0111
		int b = 8; //1000
		System.out.println(bitsToChangeAtoB(a,b));
	}
	
	static int bitsToChangeAtoB(int a, int b) {
		int exor = a ^ b;
		int setBits = 0;
		
		while(exor > 0) {
			if((exor & 1) == 1) setBits ++;
			exor = (exor>>1);
		}
		
		return setBits;
	}

}
