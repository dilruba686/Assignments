package assignments.lab03;

public class Q06_firstAndLastCharMissing {

	public static void main(String[] args) {
		
 
//		Given a string, return a version without the first and last char,
//				so "Hello" yields "ell". The string length will be at least 2.
//				withoutEnd("Hello") → "ell"
//				withoutEnd("java") → "av"
//				withoutEnd("coding") → "odin"
		
		System.out.println(withoutEnd("coding"));
		
		
	}

	public static String withoutEnd(String word) {
		
		return word.substring(1,word.length()-1);
		
		
	}
	
	
}
