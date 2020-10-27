package assignments.lab03;

public class Q03_threeCopiesOfLastTwoChars {

	public static void main(String[] args) {
		
//		    Create a method return a new string made of 3 copies of the last 2 chars of the original string. 
//			The string length will be at least 2.
//			extraEnd("Hello") → "lololo"
//			extraEnd("ab") → "ababab"
//			extraEnd("Hi") → "HiHiHi"
		
		System.out.println(extraEnd("Hi"));

	}

	
	public static String extraEnd(String word) {
		
		String lastTwo=word.substring(word.length()-2);
		word=lastTwo.repeat(3);
		return word;
		
	}
}
