package assignments.day_6_ArithmeticOperators;

public class question07_vendingmachine {

	public static void main(String[] args) {
		
		
		int change,costOfProduct,quarter,dimes,nickles;
		final int payment=100;
		costOfProduct=45;
		change=payment-costOfProduct;
		
		quarter=change/25;
		dimes=(change%25)/10;
		nickles=((change%25)%10)/5;
					
		
		
		System.out.println(change+" cent");
		
		System.out.println("Your change is "+quarter+" quarters, "+dimes+" dimes, "+nickles+" nickles");
		
	}

}
