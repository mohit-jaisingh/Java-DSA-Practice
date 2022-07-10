package arrays3_PracticeProblems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,5,1,5,6,5,3,5,5}; //len = 11
		
		int majorityElement = findMajorityElement(arr);
		if(majorityElement == -1) {
			System.out.println(" No majority element found");
		}else System.out.println(majorityElement);

	}
	
	static int findMajorityElement(int[] a) {
		
		Map<Integer,Integer> occurance = new HashMap<>();
		for(int i=0; i<a.length; i++) {
			if(occurance.containsKey(a[i])) {
				occurance.put(a[i], occurance.get(a[i])+1);
			}else {
				occurance.put(a[i], 1);
			}
		}
		int maxOccur = 0; int maxOccurElement = a[0];
		for(Map.Entry<Integer, Integer> e : occurance.entrySet()) {
			if(e.getValue()>maxOccur) {
				maxOccur = e.getValue();
				maxOccurElement = e.getKey();
			}
		}
		
		if(maxOccur > a.length/2) {
			System.out.println(maxOccur + " times");
			return maxOccurElement;
		}else return -1;
	}
	
	

}
