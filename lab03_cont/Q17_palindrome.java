package assignments.lab03_cont;

public class Q17_palindrome {

	public static void main(String[] args) {
		
		
//		Write a method that accepts a string and returns true if the string is palindrome.example-level,racecar,wow.
		
		
		System.out.println(polindrome("level"));

	}

	
	
	public static boolean polindrome(String word) {
		
//		Length = 7
//		0-6   0-Length-1
//		1-5   1-Length-2
//		2-4   2-Length-3
		
		int equalsCounter=0;
		
		for(int i=0;i<word.length();i++) {
			
			if(word.charAt(i)==word.charAt(word.length()-(i+1))){
				
				equalsCounter++;
				
				if(equalsCounter==word.length()) {
					
					return true;
				}
			}else {
				
				return false;
				
			}
		
		}
		return false;
			
	}
		
		
		
		
		
		
		
		
	}

