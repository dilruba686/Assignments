package assignments.lab2;
import java.util.Scanner;
public class Q04_femaleMalePercantage {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of females in your class:");
		int female=scan.nextInt();
		System.out.println("Enter the number of males in your class:");
        int male=scan.nextInt();
        
        int total=female+male;
        System.out.println("Percentage of females :"+100*female/total);
		System.out.println("Percentage of females :"+100*male/total);
		
		
	}

}
