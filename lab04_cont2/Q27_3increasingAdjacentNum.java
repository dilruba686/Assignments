package assignments.lab04_cont2;

public class Q27_3increasingAdjacentNum {

	public static void main(String[] args) {
	
		
		
		
//		Write a method that accepts an array and prints true if the array contains, 
//		somewhere, three increasing adjacent numbers like 4,5,6,... or 23,24,25.
//		
//		int[] x = {1,4,5,6,2}; //true
//		int[] y = {1,2,3}; //true
//		int[] z = {1,2,4,5,8,9}; //false
		
		int[] z = {1,2,4,5,8,9};
		int[] x = {1,4,5,6,2};
		
		System.out.println(adj(z));
		System.out.println(adj(x));
		
		

	}

	public static boolean adj(int[] arr) {
		
		for(int i=0;i<arr.length-3;i++) {
			
			if(arr[i]==arr[i+1]-1&&arr[i+1]==arr[i+2]-1) {
				return true;
			}
			
		}
		return false;
		
		
		
	}
}
