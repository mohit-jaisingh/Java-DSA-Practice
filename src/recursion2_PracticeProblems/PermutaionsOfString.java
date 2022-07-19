package recursion2_PracticeProblems;

import java.util.ArrayList;

public class PermutaionsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABC";
		FindPermutations(s,0,s.length()-1);
		
	}
	
	static void FindPermutations(String s, int l, int r){
		if(l==r) {
			System.out.println(s);
		}else {
			
			for(int i=l; i<=r; i++) {
				s = swap(s,l,i);
				FindPermutations(s,l+1,r);
				s = swap(s,l,i);
			}
			
		}
	}
	
	static String swap(String s, int l, int with) {
		char[] str = s.toCharArray();
		char temp = str[l];
		str[l] = str[with];
		str[with] = temp;
		
		return new String(str);
		
	}
	
	

}
