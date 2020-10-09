package assignments.assigment05_day12_forLoop;

public class Q02_oddNumbers {

	public static void main(String[] args) {
	 
		//Write a program that displays all odd numbers between 3-130 in the same line
   
		
		for(int i=3;i>=3&&i<=129;i+=2) {
			
			System.out.print(i+" ");
			
		}
		
		System.out.println("*****     ");
		
		// OR
		
		for(int a=3;a>=3&&a<=129;a++) {
			
			if(a%2==1) {
				
				System.out.print(a+" ");
				
			}
			
		}
		
		
		
		
		
		
		
	}

}
