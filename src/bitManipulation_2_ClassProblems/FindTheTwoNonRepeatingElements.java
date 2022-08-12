package bitManipulation_2_ClassProblems;

import java.util.ArrayList;

public class FindTheTwoNonRepeatingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,1,4,1,2,3,4,40};
		Pair twoElements = FindTwoNonRepeatingElements(a);
		System.out.println(twoElements.a + " " + twoElements.b);
	}
	
	static Pair FindTwoNonRepeatingElements(int[] a) {
		int exor = 0;
		
		for(int i=0; i<a.length; i++) { //find exor of all elements
			exor = exor^a[i]; 
		}
		
		// we remain with exor of the two non repeating elements
		
		//find the Least signigicant set bit in exor
		int mask = 1;

		while((exor & mask) == 0) {
			mask = mask<<1;
		}
		
		int firstNum = 0;
		for(int i=0; i<a.length; i++) {
			if((a[i] & mask) == 1) {
				firstNum = firstNum^a[i];
			}
		}
		
		int secondNum = exor ^ firstNum;
		
		return new Pair(firstNum, secondNum);
	}

}

class Pair {
	public int a;
	public int b;
 
	
	public Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}

}



