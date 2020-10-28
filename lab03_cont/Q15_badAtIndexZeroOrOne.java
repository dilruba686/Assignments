package assignments.lab03_cont;

public class Q15_badAtIndexZeroOrOne {

	public static void main(String[] args) {
	
//		Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". 
//	    The string may be any length, including 0.
//				hasBad("badxx") →true
//				hasBad("xbadxx") →true
//				hasBad("xxbadxx") →false
		
		System.out.println(hasBad("xbadxxadbadxx"));

	}

	public static boolean hasBad(String word) {
		
		
		if(word.substring(0, 3).equals("bad")||word.substring(1, 4).equals("bad")){
			
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
}
