package com.syntaxInJava2;

import java.util.Scanner;

public class ReplItPractice {

	public static void main(String[] args) {

		// System.out.println("in:");
		// int num = scan.nextInt();
		// if (num == 5) {
		// System.out.println(" 5 is positive");
		// }else if(num==-2) {
		// System.out.println("-2 is negative");
		// }else
		// System.out.println(" Enered number is equals to 0");

		// System.out.println("Hello, please enter your name");
		// String name = scan.next();
		// System.out.println("Your name is "+name);

		// System.out.println("Input the boolean value");
		// boolean myBool = scan.nextBoolean();
		// if(myBool==true) {
		// System.out.println("The value is true");
		// }else
		// System.out.println("The value is false");

		// System.out.println("in");
		// String name = scan.next();
		// if(name.equals("Chen")){
		// System.out.println("Teacher");
		// }else
		// System.out.println("Student");
		// System.out.println("Please enter your age");
		// int age = scan.nextInt();
		// if(age>=18) {
		// System.out.println("You are eligible to vote");
		// }else {
		// System.out.println("You are not eligible to vote");

		// System.out.println("Please enter your the length");
		// int length = scan.nextInt();

		// System.out.println("Please enter the width");
		// int width = scan.nextInt();

		// if(length==18 && width==16) {
		// System.out.println("The shape of your object is rectangle");
		// }else {
		// System.out.println("The shape of your object is square");
		// }

		// System.out.println("Pleass enter first number");
		// int x = scan.nextInt();

		// System.out.println("Please enter second number");
		// int y = scan.nextInt();

		// if(x*y>=0 ) {
		// System.out.println("true");
		// }else {
		// System.out.println("false");
		// }

		/*
		 * System.out.println("Please enter month number 1"); int month =
		 * scan.nextInt(); if(month==1) { System.out.println("january"); }else
		 * if(month==2) { System.out.println("february"); }else if(month==3) {
		 * System.out.println("march"); }else if(month==4) {
		 * System.out.println("april"); }else if(month==5) { System.out.println("may");
		 * }else if(month==6) { System.out.println("june"); }else if(month==7) {
		 * System.out.println("july"); }else if(month==8) {
		 * System.out.println("august"); }else if(month==9) {
		 * System.out.println("september"); }else if(month==10) {
		 * System.out.println("october"); }else if(month==11) {
		 * System.out.println("november"); }else if(month==12) {
		 * System.out.println("december"); }else System.out.println("Invalid");
		 */

		/*
		 * System.out.println("Is it  sunny outside"); boolean isSunny =
		 * scan.nextBoolean(); int temperature = scan.nextInt(); if(isSunny) {
		 * System.out.println("It is a sunny day, I should go somewhere");
		 * if(isSunny=false) { System.out.println("I stay home and practice Java"); } }
		 */

		// System.out.println("Please enter month number 1 ");
		// int month = scan.nextInt();
		// if(month==1) {
		// System.out.println("January");
		// }else
		// System.out.println("Invalid");

		// System.out.println("Please enter 3 distinct numbers");
		// int num1, num2,num3,num4 = scan.nextInt();
		// System.out.println("The largest number is 14");

		// System.out.println("Please enter a number");
		// int number = scan.nextInt();
		// if (number % 2 == 0) {
		// if(number>1000) {
		// System.out.println("Value is even");
		// System.out.println("Even value is large");

		// System.out.println("Enter your name");
		// String name = scan.nextLine();

		// System.out.println("Enter your mobile number");
		// String number = scan.nextLine();

		// System.out.println("Enter your age");
		// int age = scan.nextInt();

		// System.out.println("Your name is "+name+","+" your age is "+age+ " and your
		// mobile number is "+number);

		// int x =4;
		// if(x==3) {
		// System.out.println("You are right");
		// }else
		// System.out.println("You are wrong");

	//	System.out.println("Please enter a number");
		//int number = scan.nextInt();
		//if (number % 2 == 0) {
		//	System.out.println("Value is even");
			//if (number > 1002) {
			//	System.out.println("Even value is large");
			//} else
				//System.out.println("Even value is just right");
	//	} else
		//	System.out.println("Value is odd");
		Scanner scan = new Scanner(System.in);
		//System.out.println("Please enter your gender: M or F");
		//String gender = scan.next();
		
	///	System.out.println("Please enter your age");
	//	int age = scan.nextInt();
	//	if(age>25) {
		//if(gender=="F") {
		//	System.out.println("Woman");
		//}else {
		//	System.out.println("Man");
		//}
		///}
		//if(age<25) {
		//	System.out.println("Girl");
		//}else {
		//	System.out.println("Boy");
		//}
		
		System.out.println("Please enter your gender: M or F");
		char gender = scan.next();
		
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		if(age>25) {
		if(gender=='F') {
			System.out.println("Woman");
		}else {
			System.out.println("Man");}
		}else {if(gender=='F') {
			System.out.println("Girl");
		}else {
			System.out.println("Boy");
		}
		}
		
		
		
	}
}
