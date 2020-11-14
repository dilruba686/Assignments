package assignments.lab04;

public class Q08_contains2Or3 {

	public static void main(String[] args) {
	
		
//		Write a method that accepts an array and prints true if it contains a 2 or a 3
//		int[] x = {2,5};  = > true
//		int[] y = {4,3};  = > true
//		int[] z = {4,5};  = > false
		
		int[] y = {4,3};

		System.out.println(contains2or3(y));
		
		
	}

	public static boolean contains2or3(int[] arr) {
		
		
		for(int value:arr) {
			
			if(value==2||value==3) {
				
				return true;
				
			}
		
			
	 }
		return false;
	}
	
}
