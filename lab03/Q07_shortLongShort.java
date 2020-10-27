package assignments.lab03;

public class Q07_shortLongShort {

	public static void main(String[] args) {
		
//		 Given 2 strings, a and b, return a string of the form short+long+short,
//		 with the shorter string on the outside and the longer string on the inside.
//				comboString("Hello", "hi") → "hiHellohi"
//				comboString("hi", "Hello") → "hiHellohi"
//				comboString("aaa", "b") → "baaab"
		
		
		System.out.println(comboString("Hello","Hi"));

	}

	public static String comboString(String word1,String word2) {
		
		if(word1.length()>word2.length()) {
			
			return word2.concat(word1).concat(word2);
			
	}else {
		
		return word1.concat(word2).concat(word1);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
