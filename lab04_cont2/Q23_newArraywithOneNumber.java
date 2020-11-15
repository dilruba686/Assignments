package assignments.lab04_cont2;

import java.util.Arrays;

public class Q23_newArraywithOneNumber {

	public static void main(String[] args) {
		
		
//		Write a method that accepts a number and create and prints a new array of lengthnumber,
//		containing the numbers 0,1,2,...number-1.
//		fizzArray(4) →[0, 1, 2, 3]
//		fizzArray(1) →[0]
//		fizzArray(10) →[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

		int a=10;
		
		System.out.println(Arrays.toString(newArray(a)));
		
		
	}

	public static int[] newArray(int x) {
		
		int[] arr=new int[x];
		
		for(int i=0;i<x;i++) {
			
			arr[i]=i;
			
		}
		return arr;
		
		
		
		
	}
}
