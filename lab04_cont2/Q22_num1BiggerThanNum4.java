package assignments.lab04_cont2;

public class Q22_num1BiggerThanNum4 {

	public static void main(String[] args) {
	
//		Write a method that accepts an array and prints true if the number of 1's is greater than the number of 4's
//		int[] x = {1,4,1}  = > true
//		int[] x = {1,4,1,4}  = > false
//		int[] x = {1,1}  = > true
		
		int[] x = {1,4,1,4};
		int[] y = {1,4,1};
	
		System.out.println(oneGreater(x));
		System.out.println(oneGreater(y));
		
	}

	public static boolean oneGreater(int[] arr) {
		int oneCounter=0;
		int fourCounter=0;
		
		for(int value:arr) {
			
			if(value==1) {
				oneCounter++;
			}else if(value==4) {
				fourCounter++;
			}
		}
        
		if(oneCounter>fourCounter) {
			return true;
		}
		return false;
	
	
	}

}
