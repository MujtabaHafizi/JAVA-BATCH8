package com.syntaxInJava2;

import java.util.Scanner;

public class ReviewClassCastingOct5 {

	public static void main(String[] args) {

		byte byteVar = 10;
		short shortVar = 100;
		char charVar = 'A';
		int intVar = 1000;
		long longVar = 101000;
		float floatVar = 100000;
		double doubleVar = 1000000;
		
		shortVar = byteVar;
		System.out.println(shortVar);
		
		intVar= charVar;
		System.out.println(intVar);
		
		floatVar =(float) doubleVar;
		System.out.println(floatVar);
		
		byteVar = (byte)shortVar;
		System.out.println(byteVar);
		
		byte newVar = 100;
		short newShortVar = (short) (newVar+10); // short after = sign is called casting operator.e
		System.out.println(newShortVar);
		
		int newIntVar = 100;
		long newLongVar = 2147483648l;
		float floatVar1 = 145.02f;
		
		double b = 500.4444;
		//int c = (int)500.4444;
		//System.out.println(c);
		long a =(long) 500.4444;
		System.out.println(a);
		
		short d =(short) 500.4444;
		System.out.println(d);
		
		Scanner scan = new Scanner (System.in);
		//System.out.println("Enter your age");
		//int age = scan.nextInt();
		//System.out.println("your age after 10 years is 40");
		
		System.out.println("Enter your name");
		String name = scan.next();
		
		System.out.println("Enter your mobile number");
		int phoneNumber = scan.nextInt();
		
		System.out.println("Enter your age");
		int age = scan.nextInt();
		
	}

}
