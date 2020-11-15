package assignments.lab04_cont2;

public class Q26_3oddOrEvenInARow {

	public static void main(String[] args) {
		
		
		
//		Write a method that accepts an array and prints true if the array contains 3 even or 3 odd values all next to each other.
//		int x[] = {2,1,3,5}; //true
//		int y[] = {2,1,2,5}; //false
//		int z[] = {2,4,2,5}; //true

		int x[] = {2,1,3,5}; 
		int y[] = {2,1,2,5};
		
		System.out.println(threeOddEven(x));
		System.out.println(threeOddEven(y));
		
		
	}
	public static boolean threeOddEven(int[] arr) {
		
		for(int i=0;i<arr.length-2;i++) {
			
			if(arr[i]%2==0&&arr[i+1]%2==0&&arr[i+2]%2==0) {
				
				return true;
				
			}else if(arr[i]%2==1&&arr[i+1]%2==1&&arr[i+2]%2==1) {
				
				return true;
			}	
		
		
			
		}
		return false;
	
		
		
		
	}

}
