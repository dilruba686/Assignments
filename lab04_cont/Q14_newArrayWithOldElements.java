package assignments.lab04_cont;

import java.util.Arrays;

public class Q14_newArrayWithOldElements {

	public static void main(String[] args) {
		
		
//		Write a method that accepts 2 arrays and prints a new array containing all their elements
//		int[] x = {1,2};    int[]y={3,4};  = > [1,2,3,4]
//		int[] x = {4,4};    int[] y = {2,2};  = > [4,4,2,2]
//		int[] x = {9,2};    int[] y = {3,4};  = > [9,2,3,4]
		
		int[] x = {9,2};
		int[] y = {3,4};
		
		
		int[] a = {4,4};
		int[] b = {2,2};
		
		System.out.println(Arrays.toString(newArray(x, y)));
		System.out.println(Arrays.toString(newArray(a, b)));
		
	}

	public static int[] newArray(int[] arr,int[] arr2) {
		
		int[] newArr=new int[arr.length+arr2.length];
	
		for(int i=0;i<newArr.length;i++) {
			if(i<=arr.length-1) {
				
				newArr[i]=arr[i];
			}
			
			if(i>arr.length-1) {
				
				newArr[i]=arr2[i-arr.length];
				
			}
			
			
		}
		return newArr;
		
	
		
		
		
	}
	
	
}
