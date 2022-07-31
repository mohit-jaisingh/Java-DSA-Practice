package bitManipulation_2_ClassProblems;

public class FindTheOnlyNonRepeatingElement {
	//Every other element repeats twice

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,2,6,5,1,6,8,5,3};
		System.out.println(PrintNonRepeatingElement(a));
	}
	
	static int PrintNonRepeatingElement(int[] a) {
		int element = a[0];
		
		for(int i=1; i<a.length; i++) {
			element = element ^ a[i];
		}
		
		return element;
	}

}
