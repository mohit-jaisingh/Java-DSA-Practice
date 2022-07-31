package bitManipulation_2_ClassProblems;

import java.util.ArrayList;

public class FindTheTwoNonRepeatingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,2,2,3,4,5,5,6,6};
		Pair twoElements = FindTwoNonRepeatingElements(a);
		System.out.println(twoElements.a + " " + twoElements.b);
	}
	
	static Pair FindTwoNonRepeatingElements(int[] a) {
		int exor = a[0];
		
		for(int i=1; i<a.length; i++) {
			exor = exor^a[i];
		}
		
		int mask = 1;

		while((exor & mask) == 0) {
			mask = mask<<1;
		}
		
		ArrayList<Integer> x = new ArrayList<>(); // has 1 at LSSB of mask
		ArrayList<Integer> y = new ArrayList<>(); // has 0 
		
		for(int i=0; i<a.length; i++) {
			if((a[i] & mask) == 1) {
				x.add(a[i]);
			}else y.add(a[i]);
		}
		
		int firstNum = exor;
		for(int e : x) {
			firstNum = firstNum^e;
		}
		
		int secondNum = exor ^ firstNum;
		
		return new Pair(firstNum, secondNum);
	}

}


