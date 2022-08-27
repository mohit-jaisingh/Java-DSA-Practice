package bitManipulation_2_PracticeProblems;

public class FindNonRepeatingWhereOtherRepeatsKtimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,1,2,3,1,2};
		System.out.println(findNonRepeating(a, 3));
	}
	
	static int findNonRepeating(int[] a, int k) {
		
		int[] bits = new int[32];
		
		for(int i=0; i<a.length; i++) {
			int temp = a[i];
			
			int pos = 0;
			
			while(temp>0) {
				if((temp&1) == 1) {
					bits[31-pos]++;
				} 
				temp = temp>>1;
				pos++;
			}
			
		}
		
		for(int i=0; i<bits.length; i++) {
			bits[i] = bits[i]%k;
		}
		
		int num = 0;
		int mask = 1;
		for(int i=bits.length-1; i>=0; i--) {
			if(bits[i] == 1) {
				num = num|mask;
			}
			mask = mask<<1;
		}
		
		return num;
	}

}
