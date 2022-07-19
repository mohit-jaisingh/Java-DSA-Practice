package recursion2_ClassProblems;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class GenerateAllSubsequencesOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaa";
		GenerateAllSubsequences(s);
		System.out.println("count = " + Math.pow(2,s.length()));
	}
	
	static void GenerateAllSubsequences(String s) {
		Set<String> set = new HashSet<>();
		utilGenerateAllSubsequences(s, 0, "",set);
		
		for(String st : set) {
			System.out.println(st + " ");
		}
	}
	
	static void utilGenerateAllSubsequences(String s, int i, String cur,Set<String> set) {
		if(i==s.length()) {
			set.add(cur);
			return ;
		}
		
		utilGenerateAllSubsequences(s, i+1, cur, set); //not adding char at i	
		utilGenerateAllSubsequences(s, i+1, cur+s.charAt(i), set); //adding char at i
		
	}

}
