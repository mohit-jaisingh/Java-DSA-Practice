package bitManipulation_2_ClassProblems;

import java.util.*;

public class FindOnlyNonRepeatingWhereOtherThrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,5,3,7,4,1,3,5,4,4,3,5,1}; //assume not in order.
		System.out.println(findNonRepeating(a));
	}
	
	static int findNonRepeating(int[] a) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		int exor = 0;
		for(int i=0; i<a.length; i++) {
			if(set1.contains(a[i])) {
				
				if(set2.contains(a[i])) {
					exor = exor^a[i];
				}else {
					set2.add(a[i]);
				}
				
			}else {
				set1.add(a[i]);
				exor = exor ^ a[i];
			}
		}
		
		return exor;
	}

}
