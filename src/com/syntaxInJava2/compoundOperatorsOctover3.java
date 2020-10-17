package com.syntaxInJava2;

public class compoundOperatorsOctover3 {

	public static void main(String[] args) {
		int num = 100;
		num = num + 10;
		System.out.println(num); // 110

		num = num + 200;
		System.out.println(num); // 310

		int myNum = 100;
		myNum += 10;
		System.out.println(myNum);// compound shorthanded operators

		myNum += 200;
		System.out.println(myNum); // compound operators work with all the arithmetic operators.

		myNum /= 10;
		System.out.println(myNum);

		myNum *= 1000;
		System.out.println(myNum);

		myNum %= 100;
		System.out.println(myNum);

		System.out.println("                 \n");
		int num1 = 100;
		num1 = num1 + 150;
		System.out.println(num1); // 250

		num1 = num1 + 200;
		System.out.println(num1); // 450

		System.out.println("                 \n");
		int mynum1 = 200;
		mynum1 += 100;
		System.out.println(mynum1); // 300.

		mynum1 /= 10;
		System.out.println(mynum1); // 30 is mynum1's value.

		mynum1 *= 10;
		System.out.println(mynum1);// 300
		
		
	}

}
