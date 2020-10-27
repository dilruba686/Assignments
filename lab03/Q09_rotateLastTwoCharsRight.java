package assignments.lab03;

public class Q09_rotateLastTwoCharsRight {

	public static void main(String[] args) {
	
//		Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. 
//	    The string length will be at least 2.
//				right2("Hello") → "loHel"
//				right2("java") → "vaja"
//				right2("Hi") → "Hi"
		
		
		System.out.println(right2("Hello"));
		
	}
	public static String right2(String word) {
		
	return	word.substring(word.length()-2).concat(word.substring(0, word.length()-2));
		
	}

}
