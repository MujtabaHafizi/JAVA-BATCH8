package ReviewClassOct8Part1;

import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {
		String day = "monday";
		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today I have java class");
		if(day=="Saturday") {
			System.out.println("I will also have to go for shopping");
		}
		}else {
			System.out.println(" it is neither saturday or sunday");
		}
		
		
		/*
		 * if day is 1 or 5 -- i am off from syntax
		 * if day is 2 or 3 -- GIT classes
		 * if day is 4 -- REview class
		 * if day 6 or 7 -- java class
		 * everything else will be invalid day
		 */
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter today's day using number only");
	int today=scan.nextInt();
	if(today==1 || today==5) {
		System.out.println("I am off Syntax");
	}else if(today==5 || today==3) {
		System.out.println("Git class");
	}else if(today==4) {
		System.out.println("Today is review class");
	}else if(today==6 || today ==7) {
		System.out.println("Today is Java class");
	}else {
		System.out.println("Please enter a valid day form 1 to 7");
	}
	
	String day1 = "saturday";
	if(day1.equals("saturday") || day1.equals("sunday")) {
		System.out.println("I have a java class");
	}
	
	
	
	
	}

}
