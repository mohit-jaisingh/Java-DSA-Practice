package bitManipulation_1_PracticeProblems;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		swap(a,b);
		
	}
	
	static void swap(int a, int b) {
		System.out.println("before swapping");
		System.out.println("a = " + a +" , b = " + b );
		a = a ^ b;
		b = a ^ b; //removing b from a ^ b ( a^b^b = a)
		a = a ^ b; //removing a from a ^ b (a^b^a = b)
		
		System.out.println("after swapping");
		System.out.println("a = " + a +" , b = " + b );
	}

}
