package Class8;

import java.util.Scanner;

public class Class05ContinueKeyword {

	public static void main(String[] args) {

		/*
		 * Print numbers from 1 to 50 except those that are divisible by 3
		 * 
		 * Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money accumulate the amount and tell the
		 * user how much is left to pay off. If user give more money program should
		 * return a change Whenever a user done with payments program should say “Thank
		 * you for shopping!”
		 */
		// TASK 1
		System.out.println("It prints number from 1 to 14 except 9");
		for (int i = 1; i <= 14; i++) {
			if (i % 9 == 0) {
				continue; // It prints number from 1 to 50 except.
			}
			System.out.print(i+" ");

		}
		
		
	}

}
