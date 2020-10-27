package assignments.lab03;

public class Q02_orderAbba {

	public static void main(String[] args) {
		

//		Create a method that accepts two strings, a and b, 
//		return the result of putting them together in the order abba,
//				e.g. "Hi" and "Bye" returns "HiByeByeHi".
//				makeAbba("Hi", "Bye") → "HiByeByeHi"
//				makeAbba("Yo", "Alice") → "YoAliceAliceYo"
//				makeAbba("What", "Up") → "WhatUpUpWhat"

		
		System.out.println(makeAbba("Hi","Bye"));
		
		
		
	}
     public static String makeAbba(String word1,String word2) {
    	 
    	 
    	 return word1.concat(word2)+word2.concat(word1);
    	 
    	 
     }
	
	
	
	
	
	
	
}
