package assignments.lab04;

public class Q04_sumOfElements {

	public static void main(String[] args) {
		
//		Write a method that accepts an array and prints the sum of all elements in the array
//		int[] x = {1,2,3}; = > 6
//		int[] y = {5,11,2}; = > 18
//		int[] z = {7,0,0}; = > 7
//		int[] a = {3,-2,10,4}; = > 15
       
		int[] y = {5,11,2};
		
	System.out.println(sumOfEl(y));
		
		

	}

	public static int sumOfEl(int[] arr) {
		
		int sum =0;
		
		for(int value:arr) {
			
			
			sum=sum+value;
			
		}
		
		return sum;
		
		
		
	}
	
	
	
}
