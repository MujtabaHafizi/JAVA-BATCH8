package com.SyntaxWeedEndClass5Oct10;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if a user has a credit car or not
		 * if your user does not have a credit care then offer them.
		 * if they do have one ask what is balance on the card?
		 * if balance of hte card is larger than 1000.
		 * tell them to pay off immediately , otherwise you can tell them that they can spend more.
		 * 
		 */
		Scanner scanner;
		boolean answer;
		double balance;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter IF you have a credit card(true/false)");
		answer = scan.nextBoolean();
		
		if(answer) {
			System.out.println("What is the balance on your card?");
			balance = scan.nextDouble();
			
			if(balance>1000) {
				System.out.println("Please pay off your credit balance");
				
			}else {
				System.out.println("You can spend more money");
			}
			}else {
			System.out.println("Would you like to get a credit card?");
		}
		
		
	}

}
