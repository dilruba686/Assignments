package assignments.lab03_cont;

public class Q14_endsWithLy {

	public static void main(String[] args) {
		
		
//		   Given a string, return true if it ends in "ly".
//				endsLy("oddly") →true
//				endsLy("y") →false
//				endsLy("oddy") →false
		
		System.out.println(endsLy("oddly"));

	}
	
	public static boolean endsLy(String word) {
		
		if(word.substring(word.length()-2).equals("ly")){
			
			return true;
		}else{
			
			return false;
		}
		
	}
	

}
