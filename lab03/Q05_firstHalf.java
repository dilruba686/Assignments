package assignments.lab03;

public class Q05_firstHalf {

	public static void main(String[] args) {
		
//		        Given a string of even length, return the first half. 
//				So the string "WooHoo" yields "Woo".
//				   firstHalf("WooHoo") → "Woo"
//				   firstHalf("HelloThere") → "Hello"
//				   firstHalf("abcdef") → "abc"
		
		
		System.out.println(firstHalf("HelloThere"));
		

	}
     public static String firstHalf(String word) {
    	 
    	 word=word.substring(0,word.length()/2);
    	 return word;
    	 
     }
	
	
	
	
}
