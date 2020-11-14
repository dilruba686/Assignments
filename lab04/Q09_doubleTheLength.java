package assignments.lab04;

import java.util.Arrays;

public class Q09_doubleTheLength {

	public static void main(String[] args) {
	
		
//		Write a method that accepts an array and prints a new array with double the length
//		where its last element is the same as the original array,
//		int[] x = {4,5,6};  = > [0,0,0,0,0,6]
		
		
		int[] x = {4,5,6};
		
		System.out.println(Arrays.toString(doubleTheLength(x)));
		
	}
	
	public static int[] doubleTheLength(int[] arr) {
		
		int[] newArr=new int[(arr.length)*2];
		
		newArr[newArr.length-1]=arr[arr.length-1];
		
		return newArr;
		
		
		
		
		
	}
	
	

}
