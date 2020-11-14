package assignments.lab04;

public class Q10_2Or3Twice {

	public static void main(String[] args) {
	
//		Write a method that accepts an array and prints true if the array contains 2 twice or 3 twice.
//		int[] x = {2,2}; = > true
//		int[] y = {3,3}; = > true
//		int[] a = {2,3}; = > false
//		int[] b = {12,20,42}; = > false
//		int[] c = {2,2,2}; = > false
		
		int[] y = {3,3,2};
		
		System.out.println(contains(y));
		
		

	}

	public static boolean contains(int[] arr) {
		
		int twoCounter=0;
		int threeCounter=0;
		
		for(int value:arr) {
			
			if(value==2) {
				twoCounter++;
			}else if(value==3) {
				threeCounter++;
			}
			if(twoCounter==2||threeCounter==2) {
				
				return true;
			}
			
			
		}
		return false;
		
		
	}
	
	
}
