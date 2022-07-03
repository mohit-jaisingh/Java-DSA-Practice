package arrays2_PracticeProblems;

import java.util.HashMap;
import java.util.Map;

public class PrintFrequencyOfAllElementsInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,5,6,8,8,8,8,9,9,9};
	
		printFreqOfAllElements(arr);
		
		System.out.println("****optimized****");
		printFrequencyOfAllElementsOP(arr);
	}
	
	static void printFreqOfAllElements(int[] a) { //O(n) space, O(N) time.
		Map<Integer, Integer> elementFreq = new HashMap<>();
		
		for(int i=0; i<a.length; i++) {
			int curr = a[i];
			if(elementFreq.containsKey(curr)){
				elementFreq.put(a[i], (elementFreq.get(curr))+1);
			}else{
				elementFreq.put(curr, 1);
			}
		}
		
		for(Map.Entry<Integer,Integer> e : elementFreq.entrySet()) {
			System.out.println(e.getKey() + " is present " + e.getValue() + " times.");
		}
		
	}
	static void printFrequencyOfAllElementsOP(int[] a) { //O(1) space, O(N) time.
		int count = 1;
		for(int i=1; i<a.length; i++) {
			if(a[i]== a[i-1]) {
				count ++;
			}else {
				System.out.println(a[i-1] + " is present " + count + " times.");
				count = 1;
			}
		} 
		
		System.out.println(a[a.length-1] + " is present " + count + " times.");
	}

}
