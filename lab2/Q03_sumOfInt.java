package assignments.lab2;
import java.util.Scanner;
public class Q03_sumOfInt {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a pozitive nonzero integer value:");
		int inputNum=scan.nextInt();
		int sum = 0;
		for(int i=1;i<=inputNum;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
