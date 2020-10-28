package assignments.lab03_cont;

public class Q16_makeTheLenghtTwo {

	public static void main(String[] args) {
		
//		Given a string, return a string length 2 made of its first 2 chars. 
//		If the string length is less than 2, use '@' for the missing chars.
//				atFirst("hello") →"he"
//				atFirst("hi") →"hi"
//				atFirst("h") →"h@"
		
		
		System.out.println(atFirst("h"));
		
	}

    public static String atFirst(String word) {
		
		if(word.isEmpty()) {}else if(word.length()>=2) {
		word=word.substring(0,2);
		}else {
			
			word=word+"@";
			
		}
		return word;
		
	}
}
