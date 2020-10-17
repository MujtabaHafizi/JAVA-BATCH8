package com.SyntaxWeedEndClass5Oct10;

import java.util.Scanner;

public class ClassTask5Improved4 {

	public static void main(String[] args) {

		String season = null;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Your Birth Month");

		String month = scan.next();

		if (month.equals("june") || month.equals("july") || month.equals("august")) {
			season = "Summer";
		} else if (month.equals("september") || month.equals("october") || month.equals("november")) {
			season = "Fall";
		} else if (month.equals("december") || month.equals("january") || month.equals("february")) {
			season = "Winter";
		} else if (month.equals("march") || month.equals("april") || month.equals("may")) {
			season = "Spring";
		}
		System.out.println("You were born in " + season);
	}

}
