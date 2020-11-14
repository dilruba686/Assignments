package assignments.lab04_cont;

public class Q18_sumWithout13 {

	public static void main(String[] args) {
		
		
//		Write a function that accepts an array and prints the sum of the numbers in the array.Except the number 13 is very unlucky, so it does not count and numbers that comeimmediately after a 13 also do not count
//		int[] x = {1,2,2,1}; = > 6
//		int[] y = {1,1};  = > 2
//		int[] a = {1,2,2,1,13}; = > 6
//		int[] b = {1,2,2,1,13,3}; = > 6
		
		int[] x = {1,2,2,1};
		int[] b = {1,2,2,1,13,3,5,6};
		
		System.out.println(luckySum(x));
		System.out.println(luckySum(b));
		
		

	}

	public static int luckySum(int[] arr) {
		int sum=0;
		for(int value:arr) {
			
			sum=sum+value;
			if(value==13) {
				
				sum=sum-value;
				break;
				
			}
			
		}
		return sum;
		
		
		
	}
	
	
	
}
