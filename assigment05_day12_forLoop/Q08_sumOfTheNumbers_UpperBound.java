package assignments.assigment05_day12_forLoop;
import java.util.*;
import java.util.Scanner;

public class Q08_sumOfTheNumbers_UpperBound {

	public static void main(String[] args) {
		
		
		/*Write a program to calculate the sum of the numbers from 1 till upper bound.
		 * If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
		 * If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.
		 * You should use a while loop.
		 */
		
		 Scanner input = new Scanner(System.in);
		    System.out.println("Enter an upper bound:");
		    int upperbound = input.nextInt();
		
		int i=0;
		int sum=0;
		
		
		while(i<upperbound) {
			
			i++;
			sum = sum +i;
			
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
				
				
	}

}
