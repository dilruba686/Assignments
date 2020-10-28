package assignments.lab03_cont;

public class Q13_doubleTheChars {

	public static void main(String[] args) {
		

//		        Given a string, return a string where for every char in the original,there are two chars.
//				doubleChar("The") →"TThhee"
//				doubleChar("AAbb") →"AAAAbbbb"
//				doubleChar("Hi-There") →"HHii--TThheerree"
		
		
		
		System.out.println(doubleChar("Hi-There"));
		
	}
	
	public static String doubleChar(String word) {
		String newWord="";
		for(int i=0;i<word.length();i++) {
			
			
			 newWord=newWord+word.substring(i, i+1).repeat(2);
			
		}
	
		return newWord;
		
		
	}

}
