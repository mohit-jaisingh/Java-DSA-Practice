package arrays2_PracticeProblems;

public class Move0sToEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,0,1,3,0,0,5};
		
		move0sToEndOfArray(arr);
		
		for(int e: arr) {
			System.out.print(e + " ");
		}
	}
	
	static void move0sToEndOfArray(int[] a){
		int moved = 0;
			for(int i=0; i<a.length; i++) {
				if(a[i] == 0) {
					moved++;
				}else {
					swap(a, i-moved, i);
				}
			}
		}
	
	static void swap(int[] a, int i, int j ) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void swapNoSpace(int[] a, int i, int j) {  //It won't work when you swap with self.
		a[i] = a[i] ^ a[j]; // i^j   8^8 = 0; //It will return 0 if swapped with number iteself.
		a[j] = a[i] ^ a[j];// i^j^j = i
		a[i] = a[i] ^ a[j]; // i^j^i = j
	}
	
	
	}
