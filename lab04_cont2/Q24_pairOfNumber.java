package assignments.lab04_cont2;

public class Q24_pairOfNumber {

	public static void main(String[] args) {
		
//		
//		A value is "everywhere" in an array if for every pair of adjacent elements in the array,
//		at least one of the pair is that value.Write a method that accepts an array and a number,
//		and prints true if the given number is everywhere in the array
//		int[] x = {1, 2, 1, 3};
//		int a = 2;
//		Output:false
//		int[] x = {1, 2, 1, 3};
//		int a = 1;
//		Output:true
//		
		int[] a = {1, 2, 1, 3};
		int b = 1;
		
		System.out.println(pair(a, b));
		
		
		
		
	}

	public static boolean pair(int[] arr,int x) {
		
		int xCounter=0;
		
		for(int value:arr) {
			if(value==x) {
				xCounter++;
			}
			if(arr.length/2<=xCounter) {
				return true;
			}
		
		}
		return false;
		
		
		
		
	}
	
}
