package assignments.lab2;
import java.util.Scanner;
public class Q06_taxSales {

	public static void main(String[] args) {
		
		
//		Write a program that will ask the user to enter the amount of a purchase. 
//		The program should then compute the state and county tax sales tax. 
//		Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
//		The program should display the amount of the purchase , the state sales tax, 
//		the county sales tax, the total sales tax, 
//		and the total of the sale (which is the sum of the amount of purchase plus the total sales tax)
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the amount of your purchase:");
		double amountOfPurchase=scan.nextDouble();
		
		double stateTax=amountOfPurchase*4/100;
		double countyTax=amountOfPurchase*2/100;
		
		double totalOfTheSale=amountOfPurchase+stateTax+countyTax;
		
		System.out.println("--------------------------");
		System.out.println("Amount of purchase:"+amountOfPurchase+"$");
		System.out.println("The state sales tax:"+stateTax+"$");
		System.out.println("The county sales tax:"+countyTax+"$");
		System.out.println("--------------------------");
		

	}

}
