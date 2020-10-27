package assignments.lab03;

public class Q01_concatHello {

	public static void main(String[] args) {
		
//		Create a method that accepts 1 string, e.g. "Bob", 
//		return a greeting of the form "Hello Bob!".
//				helloName("Bob") → "Hello Bob!"
//				helloName("Alice") → "Hello Alice!"
//				helloName("X") → "Hello X!"
		
      System.out.println(helloName("Bob"));
		
		
	}
	
	public static String helloName(String name) {
		
		String hello="Hello ";
		name=hello.concat(name)+"!";
		return name;
		
		
	}
}
