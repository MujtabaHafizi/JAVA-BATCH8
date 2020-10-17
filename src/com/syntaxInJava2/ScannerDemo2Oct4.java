package com.syntaxInJava2;

import java.util.Scanner;

public class ScannerDemo2Oct4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter boolean Value for rain");
		boolean rain = scan.nextBoolean(); // i am waiting fo ryur input and then hit ENTER you are done now.
		
		if(rain) {
			System.out.println("Please take an umbrella");
		}else {
			System.out.println(" it is a nice weather go for a walk");
		}
		
		System.out.println("           \n"); // always the variable or scan
		System.out.println("Please Enter your age");
		int age = scan.nextInt();
		System.out.println(age); 
	
		System.out.println("         \n");
		System.out.println("Please Enter your name");
		 String name = scan.nextLine();
		 System.out.println(" Your name is " +name+ " You are " +age+ " years old ");
	}

}
