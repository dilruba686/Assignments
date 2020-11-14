package assignments.lab04;

import java.util.Arrays;

public class Q06_greatestElement {

	public static void main(String[] args) {
		
		
//		Write a method that accepts an array and figure out which is greatest element in the array,
//	    and set all the other elements to be that value. Print the changed array.
//		int[] x = {1,2,3}; = > [3,3,3]
//		int[] y = {11,5,9}; = > [11,11,11]
//		int[] a = {110,5,98,0,1200,11,-4}; = > [1200,1200,1200,1200,1200,1200,1200]
		
		int[] y = {11,5,9,55,147};
		int[] a = {110,5,98,0,1200,11,-4};

		System.out.println(Arrays.toString(findTheGreatest(y)));
		System.out.println(Arrays.toString(findTheGreatest(a)));
		
	}

	public static int[] findTheGreatest(int[] arr) {
		
		int greater=0;
	
		for(int value:arr) {
			
			if(value>greater) {
				greater=value;
			}
		}	
			for(int i=0;i<arr.length;i++) {
				
				arr[i]=greater;
				
			}
			
		
		return arr;
		
		
		
		
	}
	
	
	
}
