package assignments.lab04;

public class Q03_compareTwoArrayLengths {

	public static void main(String[] args) {
	
		
		
//		Write a method that accepts 2 arrays and checks the lengths of the arrays first.
//		If lengths are more than 1, it prints true if the arrays have the same first elementor they have the same last element.
//		If the length of the array is not more than 1, it prints the "array1 is not a validarray " or "array2 is not a valid array"
//		
//		int[] x = {1,2,3};  = >true
//		int[] y = {7,3};
//		
//		int[] x1 = {1,2,3}; = >false
//		int[] y1= {7,3,2};
//		
//		int[] x2 = {1,2,3}; = > true
//		int[] y2= {1,3};
//		
//		int[] x3 = {1}; = > Array1 is not valid
//		int[] y3= {7,3};
//		
//		int[] x4 = {1,2,3}; = > Array2 is not valid
//		int[] y4= {1};
		
		
		int[] y4= {1};
		int[] x4 = {1,2,3};
		
		int[] x1 = {1,2,3};
		int[] y1= {7,3,2};
		
		int[] x2 = {1,2,3};
		int[] y2= {1,3};
		
		System.out.println(sameEl(x4, y4)); // array2 is not valid
		System.out.println(sameEl(x1, y1)); // false
		System.out.println(sameEl(x2, y2)); // true
		

	}
	public static String sameEl(int[] arr,int[] arr2) {
		
		
		
		if((arr.length>1&&arr2.length>1)&&(arr[0]==arr2[0]||arr[arr.length-1]==arr2[arr2.length-1])) {
		
		return "true";
	}else if((arr.length<=1||arr2.length<=1)){
		
		if(arr.length<1) {
		return "array1 is not valid";
		}else {
			return "array2 is not valid";
		}

    }
		return "false";		
		
}
	
	
	
	
	
	
	
	
	
}
	

