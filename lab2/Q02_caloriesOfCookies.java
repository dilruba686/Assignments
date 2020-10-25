package assignments.lab2;
import java.util.Scanner;
public class Q02_caloriesOfCookies {

	public static void main(String[] args) {
	
//		A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are 10 serving in the bag and that a serving equals 300 calories.
//		write a program that lets the user enter the number of cookies he or she actually ate and then reports the number of total calories consumed.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Number of cookies you ate:");
		double numOfCookies= scan.nextDouble();
		
		double totalCalorie=numOfCookies*300/4; // per Cookie=300/4 calories
		
		System.out.println("Number of calories you consumed: "+ totalCalorie);
		
		

	}

}
