package assignments.lab04_cont2;

public class Q21_sumOfTwo {

	public static void main(String[] args) {
		
		
//		Write a method that accepts an array and prints true if the sum of all 2's in the array is exactly 8
//		int[] x = {2, 3, 2, 2, 4, 2};  = > true
//		int[] x = {2, 3, 2, 2, 4, 2, 2};  = > false
//		int[] x = {1, 2, 3, 4};  = > false
		
		int[] x = {2, 3, 2, 2, 4, 2};
		int[] y = {1, 2, 3, 4};
		
		System.out.println(sumOfTwo(x));
		System.out.println(sumOfTwo(y));
	}

	public static boolean sumOfTwo(int[] arr) {
		
		int twoCounter=0;
		
		for(int value:arr) {
			if(value==2) {
				twoCounter++;
			}
		}
		if(twoCounter*2==8) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
}
