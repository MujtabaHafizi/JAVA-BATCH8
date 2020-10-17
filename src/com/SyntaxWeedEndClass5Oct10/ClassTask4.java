package com.SyntaxWeedEndClass5Oct10;

import java.util.Scanner;

public class ClassTask4 {

	public static void main(String[] args) {

		

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Your Birth Month");
		
		String month = scan.next();
		
		if (month.equals("june") || month.equals("july") || month.equals("august")) {
			System.out.println("You were born in the Summber");
		} else if (month.equals("september") || month.equals("october") || month.equals("november")) {
			System.out.println("You were born in Fall");
		}else if (month.equals("december") || month.equals("january") || month.equals("february")) {
			System.out.println("You Were Born In The Winter");
		} else if (month.equals("march") || month.equals("april") || month.equals("may")) {
			System.out.println("You Were Born In The Summer");
		}
	}
}