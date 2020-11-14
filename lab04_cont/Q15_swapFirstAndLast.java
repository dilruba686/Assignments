package assignments.lab04_cont;

import java.util.Arrays;

public class Q15_swapFirstAndLast {

	public static void main(String[] args) {
	
		
//		Write a method that accepts an array and swap the first and last element in the array.Print the modified array
//		int[] x = {1,2,3,4}; = > [4,2,3,1]
//		int[] y = {1,2,3};  = > [3,2,1]
//		int[] z= {8,6,7,9,5}; = > [5,6,7,9,8]
		
		int[] z= {8,6,7,9,5};
		int[] x = {1,2,3,4};
		System.out.println(Arrays.toString(swap(z)));
		System.out.println(Arrays.toString(swap(x)));
	}

	public static int[] swap(int[] arr) {
		
		int a=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=a;
		
		return arr;
		
		
	}
	
}
