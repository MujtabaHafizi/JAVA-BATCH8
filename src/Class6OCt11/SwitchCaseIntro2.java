package Class6OCt11;

import java.util.Scanner;

public class SwitchCaseIntro2 {

	public static void main(String[] args) {
		
		/*
		 * lets ask a tester on which browse they would like to use.
		 * 
		 */
		
		String browser;
		String message;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a browser");
		browser = scan.next();
		
		switch (browser) {
		case "safari" :
			message="Your code will be executed on safari browser";
			break;
		case "chrome":
			message = "Your code will be executed on chrome browser";
			break;
		case "firefox":
			message="Your code will be executed on firefox browser";
			break;
			default:
				message = "Entered browswer is not supported";
		
		}
		System.out.println(message);
		
		
		// switch cannot work with double , float , and long;
		// switch case can not have relationship with relational operators and logical operators.
		
		/*
		 * float f = 10.99f; double d = 19.90; long l = 19099; switch (l) {
		 */
		
		
		
	}
}
