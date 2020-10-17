package com.syntaxInJava2;

public class IFElseIfOct4 {

	public static void main(String[] args) {

		// We need to compare 2 numbers
		// bigger, smaller or equal.

		int num1 = 190;
		int num2 = 99;
		if (num1 >= num2) {
			System.out.println(num1 + " is bigger than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " is smaller than " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}
		System.out.println("         \n");
		// Based on the day of the week. we will print class schedule.

		int day = 5;
		if (day == 1) {
			System.out.println("Today is Monday we have no class");
		} else if (day == 2) {
			System.out.println("Today is Tuesday we have Manual class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday we have Manual class");
		} else if (day == 4) {
			System.out.println("Today is Thursday we have Review class");
		} else if (day == 5) {
			System.out.println("Today is Friday we have no class");
		} else if (day == 6) {
			System.out.println("Today is Saturday we have Java class");
		} else if (day == 7) {
			System.out.println("Today is Sunday we have java Class");
		} else
			System.out.println("this is invalid day of a week");

	}

}
