package assignments.lab04;

import java.util.Arrays;

public class Q05_rotateLeft {

	public static void main(String[] args) {
		
		
//		Write a method that accepts an array and prints an array with the elements"rotated left”"
//		int[] x = {1,2,3};  = > [2,3,1]
//		int[] y = {17,12,10,8}; = > [12,10,8,17]
//		int[] a = {7,0,0}; = > [0,0,7]
		
		
		int[] x = {1,2,3};
		int[] a = {7,0,0};
		int[] y = {17,12,10,8};
		
		System.out.println(Arrays.toString(rotateLeft(y)));
		System.out.println(Arrays.toString(rotateLeft(a)));
		System.out.println(Arrays.toString(rotateLeft(x)));
		
		
	}

	public static int[] rotateLeft(int[] arr) {
		
		int[] rotated=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			if(i==arr.length-1) {
				
				rotated[i]=arr[0];
				
			}else {
			
			rotated[i]=arr[i+1];
			
			}
		}
		return rotated;
		
		
	 }
	}
	

