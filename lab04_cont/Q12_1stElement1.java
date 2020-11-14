package assignments.lab04_cont;

public class Q12_1stElement1 {

	public static void main(String[] args) {
		
		
//		Write a method that accepts two arrays and prints how many of the arrays have 1 as their first element
//		int[] x = {1,2,3}        
//		Int[]y={1,3}
//		Output=2
//				
//		int[] x = {7,2,3}        
//		Int[] y = {1}
//		Output = 1
//				
//		int[] x = {3,2,4} 
//		Int[] y = {4,3,4} 
//		Output = 0
		
		int[] x = {3,2,4}; 
		int[] y = {4,3,4};
		
		int[] a = {1,2,3};        
		int[] b={1,3};
		
		
		System.out.println(firstElementCheck(x, y));
		System.out.println(firstElementCheck(a, b));

	}

	public static int firstElementCheck(int[] arr,int[] arr2) {
		
		int oneCounter=0;
		if(arr[0]==1) {
			oneCounter++;
		}
		if(arr2[0]==1) {
			oneCounter++;
		}
		return oneCounter;
		
		
	}
	
	
	
}
