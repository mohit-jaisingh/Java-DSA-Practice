package arrays2_ClassProblems;

public class TrappingRainwaterProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int blocks[] = {1,0,2,1,0,1,3,2,1,2,1};
		int maxWater = maxRainWater(blocks);
		System.out.println(" total water trapped = " + maxWater + " sq units.");
		
		int maxWaterOP = maxRainWaterOP(blocks);
		System.out.println(" optimized process ans = " + maxWaterOP + " sq units.");
	}

	static int maxRainWater(int[] a) { //O(N) time, O(2N) space;
		int n = a.length;
		int[] lMax = new int[n];
		int[] rMax = new int[n];
		lMax[0] = a[0];
		for(int i=1; i<n; i++) {
			if(a[i] > lMax[i-1]) {
				lMax[i] = a[i];
			}else lMax[i] = lMax[i-1];
		}
		
		rMax[n-1] = a[n-1];
		for(int i=n-2; i>=0; i--) {
			if(a[i]>rMax[i+1]) {
				rMax[i] = a[i];
			}else rMax[i] = rMax[i+1];
		}
//		
//		for(int l: lMax) {
//			System.out.print(l + " ");
//		}
//		System.out.println();
//		for(int r: rMax) {
//			System.out.print(r + " ");
//		}
		
		int area =0;
		int totalArea = 0;
		
		for(int i=0; i<n; i++) {
			area = Math.min(lMax[i], rMax[i]) - a[i];
			//System.out.println("area at " + i + " = " + area);
			totalArea += area;
		}
		
		return totalArea;
	}
	
	static int maxRainWaterOP(int[] a) { //O(1) space, O(N) time.
		int lMax = 0;
		int rMax = 0;
		
		int l=0;
		int r=a.length-1;
		
		int waterTrapped = 0;
		
		while(l<=r) {
			
			if(a[l]<= a[r]) { //assume a[l] < rMax also
				if(a[l]<lMax) {
					waterTrapped += lMax - a[l]; //assume lMax is also less than rMax.
				}else lMax = a[l];
				l++;
			}
			
			if(a[r] < a[l]) {  //assume a[r] < lMax also
				if(a[r] < rMax) {
					waterTrapped += rMax - a[r]; // assume rMax < lMax
				}else rMax = a[r];
				r--;
			}
			
			
			
		}
		return waterTrapped;
		
	}
}
