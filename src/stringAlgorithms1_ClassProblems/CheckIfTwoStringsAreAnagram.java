package stringAlgorithms1_ClassProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoStringsAreAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "carrier";
		String s2 = "racer";
		
		boolean isAnagram = checkIfAnagram(s1,s2);
		System.out.println(isAnagram);
		System.out.println(checkIfAnagramHP(s1, s2));
		System.out.println(checkIfAnagramCHAR(s1, s2));

	}
	
	static boolean checkIfAnagramCHAR(String s1, String s2) {
		boolean isAnagram = true;
		
		int allChar[] = new int[256];
		for(int i=0; i<s1.length(); i++) {
			allChar[s1.charAt(i)]++;
		}
		
		for(int i=0; i<s2.length(); i++) {
			allChar[s2.charAt(i)]--;
		}
		
		for(int f : allChar) {
			if(f!=0) {
				isAnagram = false;
				break;
			}
		}
		
		return isAnagram;
	}
	
	static boolean checkIfAnagramHP(String s1, String s2) { //O(N) time, O(N) space
		boolean isAnagram = true;
		Map<Character,Integer> freq= new HashMap<>();
		
		for(int i=0; i<s1.length(); i++) {
			if(freq.containsKey(s1.charAt(i))) {
				freq.put(s1.charAt(i), 1+ freq.get(s1.charAt(i)));
			}else {
				freq.put(s1.charAt(i),1);
			}
		}
		
		for(int i=0; i<s2.length(); i++) {
			if(freq.containsKey(s2.charAt(i))) {
				freq.put(s1.charAt(i), freq.get(s1.charAt(i)) -1);
			}else {
				isAnagram = false;
				break;
			}
		}
		
		for(Map.Entry<Character,Integer> e : freq.entrySet()) {
			if(e.getValue() != 0) {
				isAnagram = false;
				break;
			}
		}
		
		return isAnagram;
	}
	
	static boolean checkIfAnagram(String s1, String s2) { //O(nlogn) time, O(n)space
		boolean isAnagram = true;
			char[] str1 = s1.toCharArray();
			char[] str2 = s2.toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str2); //O(nlogn)
			
			for(int i=0; i<str1.length; i++) {
				if(str1[i] != str2[i]) {
					isAnagram = false;
					break;
				}
			}
		
			return isAnagram;
	}

}
