package com.SyntaxWeedEndClass5Oct10;

import java.util.Scanner;

public class ClassTaks1 {

	public static void main(String[] args) {

		double workedYears;
		int annualSalaryy;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many years have you worked?");
		workedYears = scan.nextInt();

		if (workedYears >= 5) {
			System.out.println("You are eligible for a bonus!");
			System.out.println("What is your annual salary");
			int annualSalary = scan.nextInt();
			if (annualSalary > 50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}

		} else {
			System.out.println("Sorry, no bonus for you"); // if the user has not worked 5 years. this will be printed.
		}
	}

}
