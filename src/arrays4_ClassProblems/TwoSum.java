package arrays4_ClassProblems;

public class TwoSum { //find two elements in sorted array with given sum

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,7,8,10,12};
		int sum = 14;
		
		System.out.println(findTwoSum(a,sum,0));
	}
	
	static boolean findTwoSum(int[] a, int sum, int startIndex) { //O(N) time, O(1) space.
		
		int i = startIndex; 
		int j = a.length -1;
		
		while(i<j) {
			if(a[i] + a[j] == sum) {
				//System.out.println("twoSum = " + sum + " ith = " + a[i] + " jth = " + a[j]);
				return true;
			}else if(a[i] + a[j] > sum) {
				j--;
			}else if(a[i] + a[j] < sum) {
				i++;
			}
		}
		
		return false;
	}

}
