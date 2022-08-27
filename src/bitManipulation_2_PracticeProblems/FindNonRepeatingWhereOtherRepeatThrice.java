package bitManipulation_2_PracticeProblems;

public class FindNonRepeatingWhereOtherRepeatThrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1,3,1,3,2,3,1};
		System.out.println(findNonRepeating(a));

	}
	
	static int findNonRepeating(int[] a) {
		int bits[] = new int[32];
		for(int i=0; i<a.length; i++) {
			int temp = a[i];
			
			int pos = 0;
		
			while(temp>0) {
				if((temp&1) == 1) {
					bits[31-pos]++;
				}
				pos++;
				temp = temp>>1;
			}
		}
		
		for(int e: bits) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		for(int i=0; i<bits.length; i++) {
			if(bits[i]%3 == 0) bits[i] = 0;
			else bits[i] = 1;
		}
		
		for(int e: bits) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		int num = 0;
		int mask =1;
		for(int i=bits.length-1; i>=0; i--) {
			if(bits[i] == 1) {
				num = num|mask;
			}
			mask = mask<<1;
		}
		
		return num;
		
	}

}
