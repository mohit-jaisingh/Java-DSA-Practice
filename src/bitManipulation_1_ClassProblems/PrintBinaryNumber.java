package bitManipulation_1_ClassProblems;

public class PrintBinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=25; i++) {
			System.out.print(i + " ");
			printBinary(i);
			System.out.println();
		}
	}
	
	static void printBinary(int a) {
		if(a==0) {
			System.out.print(0);
			return;
		}
		if(a==1) {
			System.out.print(1);
			return;
		}
		
		printBinary(a/2);
		System.out.print(a%2);
	}

}
