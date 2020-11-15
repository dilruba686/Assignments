package assignments.lab04_cont2;

public class Q25_differenceMax2 {

	public static void main(String[] args) {
		
//		Write a method that accepts two arrays of the same length.Fo r  every element in array1, consider the corresponding element in array2(at the same index).
//		Return the count of the number of times that two elements differ by 2 or less, but are not equal.
//		
//		int[] x = {1,2,3};
//		int[] y = {2,3,10};
//		Output: 2
//		
//		int[] x = {1,2,3};
//		int[] y = {2,3,5};
//		Output:3
		
		int[] x = {1,2,3};
		int[] y = {2,3,10};
		
		int[] a = {1,2,3};
		int[] b = {2,3,5};
		
		System.out.println(diff(x, y));
		System.out.println(diff(a, b));
	}

	public static int diff(int[] arr,int[] arr2) {
		int counter=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]-arr2[i]<=2&&arr2[i]-arr[i]<=2) {
				counter++;
			}
			
		}
		return counter;
		
	}
	
	
	
}
