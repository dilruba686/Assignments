package assignments.lab03_cont;

public class Q12_catDogCount {

	public static void main(String[] args) {
		
		
//		Return true if the string "cat" and "dog" appear the same number of times in the given string.
//		catDog("catdog") →true
//		catDog("catcat") →false
//		catDog("1cat1cadodog") →true
		
		
		System.out.println(catDog("catcathorsedogdogdogcat"));
		
	}

    public static  int catCounter(String word) {
		
		int counter=0;
		
		if(word.contains("cat")) {
			
			counter++;
			int firstCat=word.indexOf("cat");
			
			for(int i=firstCat+1;i<word.length();i++) {
				
				
				if(word.indexOf("cat", i)!=-1) {
					
					counter++;
					i=word.indexOf("cat", i);
				}
			}
			
			return counter;
			
		}else {
			
			return 0;
			
		}
	
	} public static  int dogCounter(String word) {
		
		int counter=0;
		
		if(word.contains("dog")) {
			
			counter++;
			int firstDog=word.indexOf("dog");
			
			for(int i=firstDog+1;i<word.length();i++) {
				
				
				if(word.indexOf("dog", i)!=-1) {
					
					counter++;
					i=word.indexOf("dog", i);
					
				}
				
			}
			
			return counter;
			
		}else {
			
			return 0;
			
		}
		
	}
	public static boolean catDog(String word) {
		
	
		if(catCounter(word)==dogCounter(word)) {
			
			return true;
			
		}else {
			
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
