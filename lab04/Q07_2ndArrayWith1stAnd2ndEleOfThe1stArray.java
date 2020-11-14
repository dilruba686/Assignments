package assignments.lab04;

import java.util.Arrays;

public class Q07_2ndArrayWith1stAnd2ndEleOfThe1stArray {

	public static void main(String[] args) {
	
		
//		Write a method that accepts 2 arrays and prints the second array containing the first and last elements from the first array.
//		int[] x = {1,2,3};  
//		int[] y = {};              = > [1,3]
//		int[] a = {7,4,6,2};
//		int[] b = {};               = > [7,2]
		

		int[] a = {7,4,6,2};
		int[] b = {};
		
		System.out.println(Arrays.toString(mix(a,b)));
		
	}

	public static int[] mix(int[] arr,int[] arr2) {
		
	    arr2=new int[2];
		arr2[0]=arr[0];
		arr2[1]=arr[arr.length-1];
		
		return arr2;
		
		
	}
	
	
}
