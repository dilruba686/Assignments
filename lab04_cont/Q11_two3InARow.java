package assignments.lab04_cont;

import java.util.Arrays;

public class Q11_two3InARow {

	public static void main(String[] args) {
	
		
//		Write a method that accepts an array, and if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Print the changed Array
//		int[] x = {1,2,3}  = > [1,2,0]
//		int[] x = {2,3,5}  = > [2,0,5]
//		int[] x = {1,2,1}  = > [1,2,1]
//		int[] x = {11,2,13,3,2}  = > [11,2,13,3,2]
		
		int[] x = {2,3,5};
		int[] y = {11,2,13,3,2};
		int[] z = {1,2,1};
		System.out.println(Arrays.toString(two3InARow(x)));
		System.out.println(Arrays.toString(two3InARow(y)));
		System.out.println(Arrays.toString(two3InARow(z)));
	}

	public static int[] two3InARow(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==2 && arr[i+1]==3) {
				
				arr[i+1]=0;
				
				
			}
			
			
		}
		
		return arr;
		
		
	}
	
	
	
}
