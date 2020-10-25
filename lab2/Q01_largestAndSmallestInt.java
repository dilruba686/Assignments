package assignments.lab2;
import java.util.Scanner;
public class Q01_largestAndSmallestInt {

	public static void main(String[] args) {
		
//		Write a program with a loop that lets the user enter a series of integer numbers.
//		After all the numbers have been entered, the program should display the largest and smallest numbers entered.


	       Scanner scan = new Scanner (System.in);
			
			System.out.println("Enter your first number:");
			int num1 = scan.nextInt();
			
			System.out.println("Enter your next number:");
			int num2 = scan.nextInt();
			
			System.out.println("Do you want to enter another number: 0-No, 1-Yes");
			int yesNo = scan.nextInt();
			
			
			int smallestNum;
			int biggestNum;
			if(num1>num2) {
			 smallestNum=num2;
			 biggestNum=num1;
			}else {
				smallestNum=num1;
				biggestNum=num2;
			}

			while(yesNo==1) {
					
					System.out.println("Enter your next number:");
					 int inputNum = scan.nextInt();
					System.out.println("Do you want to enter another number: 0-No, 1-Yes");
					yesNo=scan.nextInt();
					
					if(inputNum<smallestNum) {
						smallestNum=inputNum;
					  }else if(inputNum>biggestNum) {
						  biggestNum=inputNum;
					  }
				
			}
			System.out.println("Smallest number is:"+smallestNum);
			System.out.println("Largest number is:"+biggestNum);
		
		
		
		

	}

}
