package assignments.lab1;

public class Q04_SummerDeers {

	public static void main(String[] args) {
		
//		The deers in VA spend most of the day playing. In particular, they play if the temperature is between 60 and 90.
//		Unless it is summer, then the upper limit is 100 instead of 90.
//		Write a method that accepts temperature and a boolean isSummer, prints true if the deers play and false otherwise.
//
//
//		deerPlay(70, false); - > true
//		deerPlay(95, false); - > false
//		deerPlay(95, true); - > true

		deerPlay(65, true);
		deerPlay(70, false);
		deerPlay(95, false); 
		deerPlay(95, true); 
	}
    public static void deerPlay(int num,boolean isSummer) {
    	
    	int upperlimit=90;
    	if(((num>60&&num<upperlimit)||((num>60&&num<upperlimit+10)&&isSummer))) {
    		System.out.println("true");
    	}else {
    		System.out.println("false");
    	}
    }
}
