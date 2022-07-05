package stringAlgorithms1_ClassProblems;

public class ReverseWordsInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse each word
		// reverse whole string.
		String sentence = "The weather is good";
		System.out.println(reverseWords(sentence.toCharArray()));
		
		
	}
	
	static String reverseWords(char[] s) {
		int from = 0;
		for(int i=0; i<s.length; i++) {
			if(s[i] == ' ') {
				reverse(s, from , i-1); //reverse word found
				from = i+1;
			}
		}
		
		reverse(s, from, s.length-1);// reverse last word
		
		reverse(s,0,s.length-1); //reverse whole string
		
		return new String(s);
	}
	
	static void reverse(char[] s, int from, int till) {
		while(from<till) {
			char temp = s[from];
			s[from] = s[till];
			s[till] = temp;
			from++;
			till--;
		}

	}

}
