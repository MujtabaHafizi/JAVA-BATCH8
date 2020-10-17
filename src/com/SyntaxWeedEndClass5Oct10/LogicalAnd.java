package com.SyntaxWeedEndClass5Oct10;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any number");
		int number = scan.nextInt();

		if (number > 0 || number <= 10) {
			System.out.println("You entered small number"); // After i changed && to || then it gave me that "You
															// entered small number" cause it is right
		} else if (number > 10 && number <= 100) { // 1000>0(true) and 1000!<10(false) and since true + false = true.
			System.out.println("You entered medium number");
		} else if (number > 100 && number <= 1000) {
			System.out.println("You entered large number");
		} else if (number > 1000 && number <= 5000) {
			System.out.println("You Entered Super Large number");
		} else {
			System.out.println("Enter a number between greater than 0 and less than and equal to 5000");
		}
	}

}
