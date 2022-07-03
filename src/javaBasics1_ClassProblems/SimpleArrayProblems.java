package javaBasics1_ClassProblems;

public class SimpleArrayProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,2,4,7,8,4,6,9};
		int key =2;
		
		searchElement(arr,key); 
		
		int size = deleteElement(arr, key);
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("max = "+ largestElement(arr));
		System.out.println("second largest = " + secondLargest(arr));
		
		int[] sortedArr = {1,2,2,3,3,3,4,5,6,6,6,7};
		int newSize = removeDuplicatesFromSortedArray(sortedArr);
		System.out.println("After removing duplicates");
		for(int i=0; i<newSize; i++) {
			System.out.print(sortedArr[i] + " ");
		}
		

	}
	
	public static void searchElement(int[] a, int key) {
		int index =-1;
		for(int i=0; i<a.length; i++) {
			if(a[i]==key) {
				index =i;
			}
		}
		
		if(index>=0) {
			System.out.println(key + " found at " + index + " index");
		}else System.out.println(key + " not found");
		
		
	}
	
	
	public static int deleteElement(int[] a, int key) {
		int i=0;
		int n = a.length;
		for(; i<n; i++) {
			if(a[i] == key) {
				break;
			}
		}
		
		if(i==n) return n; // not found
		
		for(int j=i; j<n-1; j++) {
			a[j] = a[j+1];
		}
		
		return n-1;
		
	}
	
	public static int largestElement(int[] a) {
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] > max) max = a[i];
		}
		return max;
	}
	
	public static int secondLargest(int[] a) {
		int largest = 0;
		int second = -1;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>largest) {
				second = largest;
				largest = a[i];
			}
			
			if(a[i]<largest && a[i]>second || second == -1 ) {
				second = a[i];
			}
		}
		
		
		return second;
	}
	
	public static int removeDuplicatesFromSortedArray(int[] sortedArr) {
		
		int del =0;
		for(int i=1; i<sortedArr.length; i++) {
			if(sortedArr[i]==sortedArr[i-1]) {
				del++;
			}else {
				sortedArr[i-del] = sortedArr[i];
			}
		}
		
		int newSize = sortedArr.length - del;
		return newSize;
	}
	
	

}
