package assignments.lab04_cont;

public class Q16_numOfEvenNumbers {

	public static void main(String[] args) {
	
		
//		Write a method that accepts an array and prints the number of even numbers in the array.
//		int[] x = {2,1,2,3,4}; = > 3
//		int[] y = {2,2,0};  = > 3
//		int[] z= {1,3,5}; = > 0
		
		int[] x = {2,1,2,3,4};
		int[] z= {1,3,5};
		
		System.out.println(even(x));
        System.out.println(even(z));
		
	}

	public static int even(int[] arr) {
		
		int evenCounter=0;
		
		for(int value:arr) {
			
			if(value%2==0) {
				evenCounter++;
			}
			
		}
		return evenCounter;
		
	}
}
