package assignments.lab1;

public class Q05_caughtSpeeding {

	public static void main(String[] args) {
		
//		You are driving a little too fast, and a police officer stops you.
//		Write a method to compute the result: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
//		If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day,
//		your speed can be 5 higher in all cases.
//
//				caughtSpeeding(60, false) → 0
//				caughtSpeeding(65, false) → 1
//				caughtSpeeding(65, true) → 0

		caughtSpeeding(80,false);
		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
     	caughtSpeeding(65, true);

	}
    public static void caughtSpeeding(int speed,boolean isMyBday) {
    	 
    	if(speed<=60||(speed<=65&&isMyBday)) {
    		System.out.println("0");
    	}else if((speed>=61&&speed<=80)||(speed>=61&&speed<=85)&&isMyBday){
    		System.out.println("1");
    	}else if(speed>=81) {
    		System.out.println("2");
    	}
    			
    	
    }
}
