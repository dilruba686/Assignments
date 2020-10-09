package assignments.assigment05_day12_forLoop;
import java.util.*;
public class Q04_multiplyBy10 {

	public static void main(String[] args) {
		/* 
		 * Write a while loop that lets the user enter a number. The number should be multiplied by 10,
		 *and the result stored in the variable product.
		 *The loop should iterate as long as product contains a value less than 100.
		 *
		 **/
		
		 Scanner input = new Scanner(System.in);
		    System.out.println("Enter a number:");
		    int num = input.nextInt();
		    
		    while(num<100) {
		    	
		    	
		    	num*=10;
		    	System.out.println(num);
		    
		    }
		    
		    
		    
		
		
	}

}
