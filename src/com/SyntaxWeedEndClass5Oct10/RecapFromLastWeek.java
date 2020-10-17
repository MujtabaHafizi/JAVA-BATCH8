package com.SyntaxWeedEndClass5Oct10;

import java.util.Scanner;

public class RecapFromLastWeek {

	public static void main(String[] args) {
		
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		// i want to capture a sentence
		String sentence = scan.nextLine();
		System.out.println("You entered sentence: "+sentence);
		
		System.out.println("Please enter any number");
		int number = scan.nextInt();
		System.out.println("You entered number: "+number);
	
		System.out.println("Please enter any single character");
		char singleCharacter = scan.next().charAt(0);
		System.out.println("You entered Character: "+singleCharacter); // When it comes to Char it only prints one character even if there is more than one letters cause CHAR only works with one character...
		
		
		
	}

}
