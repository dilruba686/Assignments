package assignments.assigment05_day12_forLoop;

public class Q09_commaSeperatedNumbers {


	public static void main(String[] args) {
		/*
		 * Write a program for the following logic:
		 * Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
		 *  if end = 10, OUTPUT = 1, 3, 5, 7, 9
		 *  if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
		 *  You should use while loop and if-else statements. Note that, there should not be any comma after the last digit.
		 */
		
			
		
		int num=1;
		int end=11;
		while(num<end) {
			System.out.print(num);
			num+=2;
			if(num!=end) {
				System.out.print(",");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
