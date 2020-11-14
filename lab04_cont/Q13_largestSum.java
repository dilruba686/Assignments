package assignments.lab04_cont;

import java.util.Arrays;

public class Q13_largestSum {

	public static void main(String[] args) {
	
		
//		Write a method that accepts 2 arrays and consider the sum of the values in each array.Print the array which has the largest sum. In event of a tie, print "equal"
//		int[] x = {1,2};    int[] y={3,4};  = > [3,4]
//		int[] x = {5,6};    int[] y = {3,8};  = > equal 
//		int[] x = {1,1};    int[] y = {1,0};  = > [1,1]
		

		int[] x = {1,2};
		int[] y={3,4};
		
		int[] a = {5,6};
		int[] b = {3,8};
		
		largestSum(x, y);
		largestSum(a, b);
	}

	public static void largestSum(int[] arr,int[] arr2) {
		int sum1=0;
		int sum2=0;
		for(int value:arr) {
			sum1=value+sum1;
		}
		for(int value:arr2) {
			sum2=sum2+value;
			
		}
		
		if(sum1>sum2) {
			
		System.out.println(Arrays.toString(arr));
		}else if(sum1==sum2) {
			System.out.println("equal");
		}else {
			System.out.println(Arrays.toString(arr2));
		}
		
		
	}
	
	
	
	
}
