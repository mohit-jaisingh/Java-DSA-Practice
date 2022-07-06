package stringAlgorithms1_PracticeProblems;

public class FindLengthOfLastWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am a boss";
		
		System.out.println("The length of the last word in \"" + s + "\" is " + 
		              lengthOfLastWord(s));
	}
	
	static int lengthOfLastWord(String s) {
		int len = 0;
		
		char[] arr = s.toCharArray(); 
		
		for(int i=arr.length-1; i>=0; i--) { //travese from last
			if(arr[i] != ' ') { // when space is found, return length of last word.
				len++;
			}else return len;
		}
		
		return len;
	}

}
