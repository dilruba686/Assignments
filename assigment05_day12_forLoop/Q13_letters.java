package assignments.assigment05_day12_forLoop;

public class Q13_letters {

	public static void main(String[] args) {
		
		

		int rows=8;
		int columns=4;
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=columns;j++) {
			   
			    if(i%2==0) {
			    	System.out.print("B"+" ");
				    System.out.print("W"+" ");
			    }else {
			    	System.out.print("W"+" ");
				    System.out.print("B"+" ");
			    }
			}
			System.out.println();
			
			
		}
			
		
		
		
		

	}

}
