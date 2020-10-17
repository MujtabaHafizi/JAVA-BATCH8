package com.syntaxInJava2;

// shortcut to import Ctrl + Shift+ O.
// shortcut to import Command + shift +O.
import java.util.Scanner;

public class ScannerDemoOct4 {

	public static void main(String[] args) {

		int num = 80;
		String str = " I am a String";
		Scanner scan = new Scanner(System.in); // enable input to the console.
		// A message to the users
		System.out.println("Please Enter any text"); // we added this part later.
		String value = scan.nextLine(); // waits for your input and once you provided input ---- hit ENTER
		System.out.println("I captured value = " + value);
		
		System.out.println("Please Enter Your Name");
		String name=scan.nextLine();
		System.out.println("Nice to meet you");
		
		
	}

}
