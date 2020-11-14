package assignments.lab04;

public class Q02_lengthCheck {

	public static void main(String[] args) {
	
		
		
//		Write a method that accepts an array and check the length of the array first.
//		If the length is more than one, check if the first element and last elementare equal.
//		if it is print true, if not print false.If the length is not more than 1, print not valid an array
//		int[] x = {1,2,3}; = > false
//		int[] y = {1,2,3,1}; = > true
//		int[] z = {1,2,1}; = > true
//		int[] k = {1}; = > not a valid array
		
		
		int[] arr1={17,89,6,43,17};
		
		System.out.println(checkLength(arr1));
		
		
	}
	
	public static boolean checkLength(int[] array) {
		
		if(array.length>1) {
			
			if(array[0]==array[array.length-1]) {
				
				return true;
			}else {
				return false;
			}
			
			
		}else {
			return false;
		}
		
		
		
	}
	
	
	
	
	
	
	

}
