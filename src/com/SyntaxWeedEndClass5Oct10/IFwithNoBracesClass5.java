package com.SyntaxWeedEndClass5Oct10;

public class IFwithNoBracesClass5 {

	public static void main(String[] args) {
		
		boolean isSaturday = true;
		if(isSaturday) {
			System.out.println("Today is a Java Class"); // if no braces only 1 line will be treated as code for if block
			System.out.println("and tomorrow i will have a Java class"); // this code does not belong to the if statement(because no brace)
		
	}

		System.out.println("               \n");
		boolean isTomorrowSunday = false;
		if(isTomorrowSunday) {
			System.out.println("I have a java class at 10 AM");
			System.out.println("I have to take the kids to the park too"); // Nothing will be printed cause isTomorrowSunday = false.
		}
		
		boolean isMondayHolliday = true;
		if(isMondayHolliday) {
			System.out.println("The kids would not have to go to school");
			System.out.println("I would not i have class either"); // since isMondayHolliday = true. everything will be printed.
	}
		System.out.println(" I am code outside of the if statement");
		
		System.out.println("                 \n");
		boolean isHeThePresident = false;
		if(isHeThePresident)
			System.out.println("He is the president");
		System.out.println("He will be the president");
		System.out.println(" I am code outside of the if statement"); // whenever we forget the {} after first statement, Java will not print the first condition but it will start from the second and last constion.

	}
}
