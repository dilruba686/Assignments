package assignments.lab03_cont;

public class Q11_numberOfHiInTheString {

	public static void main(String[] args) {
		
		System.out.println(countHi("hihellohihellohihi"));

	}

	public static  int countHi(String word) {
		
		int counter=0;
		
		if(word.contains("hi")) {
			
			counter++;
			int firstHi=word.indexOf("hi");
			
			for(int i=firstHi+1;i<word.length();i++) {
				
				
				if(word.indexOf("hi", i)!=-1) {
					
					counter++;
					i=word.indexOf("hi", i);
					
				}
				
			}
			
			return counter;
			
		}else {
			
			return 0;
			
			
		}
	

		
		
		
		
		
		
		
		
	}
}
