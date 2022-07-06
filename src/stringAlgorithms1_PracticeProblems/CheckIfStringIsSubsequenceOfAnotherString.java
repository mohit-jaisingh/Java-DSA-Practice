package stringAlgorithms1_PracticeProblems;

public class CheckIfStringIsSubsequenceOfAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abbc";
		String s2 = "paababbcd";
		
		System.out.println(checkIfSubstring(s2, s1));
	}
	
	static boolean checkIfSubstring(String a, String b) { //checks if b is substring of a.
		boolean found = false;
		
		if(a.length()<b.length()) {
			return checkIfSubstring(b,a); //if input is otherway, call for right order of input.
		}
		
		for(int i=0; i<a.length()-b.length(); i++) {
			
			if(a.charAt(i) == b.charAt(0)) {  //find first character of b in a.
				found = true;
				int j=1;
				for(; j<b.length(); j++) {  
					if(a.charAt(i+j) != b.charAt(j)) { //check rest of characters
						found = false; //if does not match at any point, break.
						break;
					}
				}
				if(j==b.length()) { //if all characters are checked, break & return result
					break;
				}
			}
		}
		
		return found;
	}

}
