package assignments.assigment05_day12_forLoop;

import java.util.Scanner;

public class Q06_Fibonacci {

	public static void main(String[] args) {
	
		//Write a program to print Fibonacci series of n terms where n is declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......

		 Scanner input = new Scanner(System.in);
		    System.out.println("Enter a n term:");
		    int count = input.nextInt();
		    
		
		 int n1,n2,n3,i;
		 n1=0;
		 n2=1;
		 
		 System.out.print(n1+" "+n2);
		    
		 
		 for(i=2;i<count;++i){
			 
			 
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		  
		  
		 }    


		
		
		
		
		
		
		
		
		
		
	}

}
