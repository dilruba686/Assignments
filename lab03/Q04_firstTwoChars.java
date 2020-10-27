package assignments.lab03;

public class Q04_firstTwoChars {

	public static void main(String[] args) {
		
//		        Given a string, return the string made of its first two chars,
//				so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is,
//				so "X" yields "X", and the empty string "" yields the empty string "". 
//				firstTwo("Hello") → "He"
//				firstTwo("abcdefg") → "ab"
//				firstTwo("ab") → "ab"
		
		
		System.out.println(firstTwo(""));
		System.out.println(firstTwo("Hello"));
		
	}
	
	public static String firstTwo(String word) {
		
		if(word.isEmpty()) {}else {
		word=word.substring(0,2);
		}
		return word;
		
	}
	
	
	
	

}
