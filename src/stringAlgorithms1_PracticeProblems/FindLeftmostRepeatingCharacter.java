package stringAlgorithms1_PracticeProblems;

public class FindLeftmostRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "applejuice";
		System.out.println(findLeftmostRepeatingCharacter(s) + " is the leftmost character"
				+ " that repeats in " + s);
	}
	
	static char findLeftmostRepeatingCharacter(String s){
		char[] arr = s.toCharArray();
		char repEle = '-';
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == arr[i-1]) {
				repEle = arr[i];
				break;
			}
		}
		
		return repEle;
	}

}
