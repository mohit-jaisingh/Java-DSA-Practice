package bitManipulation_1_PracticeProblems;

public class FindXORfrom1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(findXOR(n)); //mathematical ans
		System.out.println(findXorOP(n)); //logical ans
	}
	
//	1  ^  2 ^  3 ^   4 ^   5
//	01 ^ 10 ^ 11 ^ 100 ^ 101
//	   11 ^ 11 = 00 ^ 100 = 100 ^ 101 = 001
	
	static int findXorOP(int n) {
		int category = n%4;
		System.out.println("remainder = " + category);
		if(category == 0) return n;
		else if(category == 1) return 1;
		else if(category == 2) return n+1;
		else return 0; //category = 3
	}
	
	static int findXOR(int n) { //naive approach
		
		int val = 0;
		val = n;
		n--;
		while(n>0) {
			val = val ^n;
			n--;
		}
		
		return val;
	}

}
