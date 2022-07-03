package arrays2_PracticeProblems;

public class LongestLengthOfConsecutive1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,0,0,1,0,1,1,1,1,0,1};
		
		System.out.println(longestLengthOf1s(arr));
		

	}
	
	static int longestLengthOf1s(int arr[]){
		int length = 0 ;
		int maxLength = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] ==1) {
				length++;
			}else {
				if(length>maxLength) {
					maxLength = length;
				}
				length = 0;
			}
		}
		
		return maxLength;
	}

}
