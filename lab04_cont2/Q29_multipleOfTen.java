package assignments.lab04_cont2;

import java.util.Arrays;

public class Q29_multipleOfTen {

	public static void main(String[] args) {
		
		
//		Write a function that accepts and array. For each multiple of 10 in the given array,
//		change all the values following it to be that multiple of 10,
//		until encountering another multiple of 10.
//		int[] x = {2,10,3,4,20,5};
//		System.out.println(Arrays.toString(tenRun(x))); // [2, 10, 10, 10, 20, 20]
//		int[] y = {10,1,20,2};
//		System.out.println(Arrays.toString(tenRun(y))); // [10, 10, 20, 20]
		
		int[] x = {2,10,3,4,20,5};
		int[] y = {10,1,20,2,5,7,30,10,5};
		
		System.out.println(Arrays.toString(mult(x)));
		System.out.println(Arrays.toString(mult(y)));
		
		

	}
	public static int[] mult(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]%10!=0) {
				
			arr[i]=arr[i-1];	
			
			}
		}
		return arr;
		}
					
					
	
		
		
	

}
