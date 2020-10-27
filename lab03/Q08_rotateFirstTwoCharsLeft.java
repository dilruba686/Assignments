package assignments.lab03;

public class Q08_rotateFirstTwoCharsLeft {

	public static void main(String[] args) {
		
//		Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
//		The string length will be at least 2.
//				left2("Hello") → "lloHe"
//				left2("java") → "vaja"
//	         	left2("Hi") → "Hi"
		
		
		System.out.println(left2("Hello"));

	}

	public static String left2(String word) {
		
		return	word.substring(2).concat(word.substring(0, 2));
		
	}
	
}
