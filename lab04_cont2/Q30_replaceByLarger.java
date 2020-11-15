package assignments.lab04_cont2;

import java.util.Arrays;

public class Q30_replaceByLarger {

	public static void main(String[] args) {
	
		
//		It is said that an element in array is alone if there are values before and after it,
//		and those values are different from it.
//		Write a method that accepts 
//		an array and a number and prints the given array where every instance of the given value which is alone is
//		replaced by whichever value to its left or right is larger.
//		
//		int[] x = {1,2,3};
//		int n = 2;
//		System.out.println(Arrays.toString(notAlone(x, n))); //[1, 3, 3]
//		
//		int[] y = {1, 2, 3, 2, 5, 2};
//		int n1 = 2;
//		System.out.println(Arrays.toString(notAlone(y, n1))); //[1, 3, 3, 5, 5, 2]
//		
		int[] y = {1, 2, 3, 2, 5, 2};
		int n1 = 2;
		
		int[] x = {1,2,3};
		int n = 2;
		
		System.out.println(Arrays.toString(replace(y, n1)));
		System.out.println(Arrays.toString(replace(x, n)));
		
		

	}
	
	public static int[] replace(int[] arr,int a) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==a) {
				
				if(arr[i-1]>arr[i+1]) {
					
					arr[i]=arr[i-1];
					
				}else {
					arr[i]=arr[i+1];
				}
				
				
				
			}
			
			
		}
		return arr;
		
		
		
	}

}
