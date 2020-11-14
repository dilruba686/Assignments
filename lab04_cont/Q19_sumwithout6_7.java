package assignments.lab04_cont;

public class Q19_sumwithout6_7 {

	public static void main(String[] args) {

		
//		Write a method that accepts an array and prints the total of the numbers in the array,
//		except ignore sections of numbers starting with a 6 and extending to the next 7(every 6 will be followed by at least one 7).
//		int[] x = {1,2,2} = > 5
//		int[] y = {1, 2, 2, 6, 99, 99, 7}  = > 5
//		int[] a = {1,1,6,7,2} = > 4
//		int[] b = {1,1,6,2} = > 2
//		int[] c = {1,2,2,6,99,99,7,3,4} = > 12
		
		int[] a = {1,1,6,4,8,2,7};
		int[] c = {1,2,2,6,99,99,7,3,4};
		int[] y = {1, 2, 2, 6, 99, 99, 7};
		int[] x = {2,3,6,8,11,17,7,5};
		
		
		System.out.println(sumWithout67(a));
		System.out.println(sumWithout67(c));
		System.out.println(sumWithout67(y));
		System.out.println(sumWithout67(x));
	}

	public static int sumWithout67(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			
			if(arr[i]==6) {
				
				if(arr[arr.length-1]==7) {
					break;
				}
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[j]==7) {
						
						i=j+1;
					}
				}
			}
			sum=sum+arr[i];	
		}
		return sum;
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
