package assignments.lab04_cont;

public class Q20_2NextTo2 {

	public static void main(String[] args) {
		
		
//		Write a method that accepts an array and prints true if the array contains a 2 next to a 2 somewhere.
//		int[] x = {1,2,2}; = > true
//		int[] y = {1, 2, 1,2};  = > false
//		int[] a = {2,1,2}; = > false
//		int[] b = {2,2,1,2}; = > true
		
		int[] b = {2,2,1,2};
		int[] x = {1,2,2};
		
		System.out.println(two(b));
		System.out.println(two(x));
		

	}

	public static boolean two(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==2&&arr[i+1]==2) {
				return true;
			}
		}
		return false;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
