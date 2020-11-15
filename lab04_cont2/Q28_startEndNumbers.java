package assignments.lab04_cont2;

import java.util.Arrays;

public class Q28_startEndNumbers {

	public static void main(String[] args) {
	
//		Write a method that accepts start and end numbers.Given start and end numbers,
//		return a new array containing the sequence of integers from start up to but not including end,
//		so start=5 and end=10 yields [5, 6, 7, 8, 9].
//		fizzArray3(5, 10); →[5, 6, 7, 8, 9]
//		fizzArray3(11, 18); →[11, 12, 13, 14, 15, 16, 17]
//		fizzArray3(1, 3); →[1, 2]

		int z=11,t=18;
		int a=1,b=3;
		
		
		System.out.println(Arrays.toString(startEnd(z, t)));
		System.out.println(Arrays.toString(startEnd(a, b)));
		
		
	}

	
	public static int[] startEnd(int x,int y) {
		
		int[] newArray=new int[y-x];
		
		for(int i=0;i<x;i++) {
			
			newArray[i]=x;
			x++;
			if(x==y) {
				break;
			}
			
		}
		return newArray;
		
		
		
	}
}
