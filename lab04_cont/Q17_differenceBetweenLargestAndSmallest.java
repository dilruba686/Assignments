package assignments.lab04_cont;

public class Q17_differenceBetweenLargestAndSmallest {

	public static void main(String[] args) {
	
		
//		Write a method that accepts an array and print the difference between the largest and smallest values in the array.
//		int[] x = {10,3,5,6}; = > 7
//		int[] y = {7,2,10,9};  = > 8
//		int[] z= {2,10,7,2}; = > 8
		
		int[] x = {10,3,5,6};
		int[] y = {7,2,10,9};
		
		System.out.println(diff(x));
		System.out.println(diff(y));

	}

	   public static int diff(int[] arr) {
		   
		   int largest=0;
		   int smallest=arr[0];
		   
		   for(int value:arr) {
			   
			   if(value>largest) {
				   largest=value;
			   }
			   if(value<smallest) {
				   smallest=value;
			   }
			   
		   }
		   
		   return largest-smallest;
		   
	   }
	
	
	
	
}
