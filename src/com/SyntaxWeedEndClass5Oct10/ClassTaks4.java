package com.SyntaxWeedEndClass5Oct10;

import java.util.Scanner;

public class ClassTaks4 {

	public static void main(String[] args) {
		Scanner scan;
		String month;
		String season;
		
		scan = new Scanner(System.in);
		System.out.println("Please Enter Your Birth Month");
		month = scan.next() ;
		
		if(month.equals("June")|| month.equals("July")|| month.equals("August")) {
			season = scan.next();
			season = "Summer";
		}else if(month.equals("September")|| month.equals("October")|| month.equals("November")) {
			season = "Fall";
		}else if(month.equals("December")|| month.equals("January") || month.equals("February")) {
			season = "Winter";
		}else if(month.equals("March") || month.equals("April")|| month.equals("May")) {
			season = "Spring";
		}else {
			System.out.println("Invalid Month");
		}
		
		
	}

}
