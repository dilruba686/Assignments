package assignments.lab04;

public class Q01_6inTheFirstOrLastElement {

	public static void main(String[] args) {
		
		
//		        Write a method that accepts an array and return true if 6 appears as eitherthe first or last element in the array.
//				The array will be length 1 or more.
//				int[] x = {1,2,6};  = > true
//				int[] y = {6,1,2,3}; = > true
//				int[] z = {13,6,1,2,3}; = > false
		
		
		
		int[] arr = {6,45,78,24,52};
	
		
		System.out.println(six(arr));
			
		}
		
		public static boolean six(int[] array) {
			
			if(array.length<1) {
				
				return false;
				
			}
			
			if(array[0]==6||array[array.length-1]==6) {
				
				return true;
				
				
			}else {
				return false;
				
			}
			
			
	
	
	
	

	}

}
