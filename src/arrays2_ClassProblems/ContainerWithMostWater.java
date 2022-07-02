package arrays2_ClassProblems;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int poles[] = {1,8,6,2,5,4,8,3,7};
		
		System.out.println("optimezed " + containerWithMostWaterOP(poles));
		System.out.println(containerWithMostWater(poles));
	}
	
	static int containerWithMostWater(int[] a) {
		int area;
		int max = 0;
		int start =0, end =-1;
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=i; j<a.length; j++) {
				area = Math.min(a[i], a[j]) * (j-1);
				if(area > max) {
					max = area;
					start =i;
					end =j;
				}
			}
		}
		
		System.out.println("max area is from " + (start+1) + " to " + (end+1));
		return max;
	}
	
	static int containerWithMostWaterOP(int[] a) { //optimised approach(two pointer)
		int maxArea =0;
		int area = 0;
		
		int start = 0,end=-1;
		
		int l = 0;
		int r = a.length-1;
		
		while(l<r) {
			area = Math.min(a[l], a[r]) * (r-l);
			if(area>maxArea) {
				maxArea = area;
				start =l;
				end = r;
			}
			
			if(a[l] > a[r]) {
				r--;
			}else l++;
		}
		System.out.println("max area is from " + (start+1) + " to " + (end+1));
		return maxArea;
	}

}
