package assignments.lab1;

public class Q01_stringTimes {

	public static void main(String[] args) {
	
//		Write a method that accepts a string and a non-negative number, and prints a larger string that is number copies of the original String
//
//		stringTimes("Hi", 2); = > HiHi
//		stringTimes("Hi", 3); = > HiHiHi
//		stringTimes("Hi", 1); = > Hi
		
		stringTimes("Hi", -5);
		

	}
	   public static void stringTimes(String word,int num) {
	    	if(num>0) {
		    for(int i=1;i<=num;i++) {
		    	System.out.print(word);
		    }
	    	}else if(num<=0) {
	    		System.out.println("Number is either negative or equal to zero!!");
	    	}
       }
}
