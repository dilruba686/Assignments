package assignments.lab03;

public class Q10_firstTwoCharsAppearAtTheEnd {

	public static void main(String[] args) {
		
		
//		Given a string, return true if the first 2 chars in the string also appear at
//	    the end of the string, such as with "edited".
//				frontAgain("edited") → true
//				frontAgain("edit") → false
//				frontAgain("ed") → true
		

		System.out.println(frontAgain("edited"));
		
	}

	public static boolean frontAgain(String word) {
		
		String endsWith=word.substring(word.length()-2);
		
		return word.startsWith(endsWith);
		
	}
	
	
}
