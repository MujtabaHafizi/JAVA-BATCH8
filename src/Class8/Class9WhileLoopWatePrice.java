package Class8;

import java.util.Scanner;

public class Class9WhileLoopWatePrice {

	public static void main(String[] args) {

		/*
		 * Ask user to pay for a water water price is 5 once user enters money then we
		 * need to tell if we need more money or less once user gives us exact 5 then we
		 * will say enjoy your water
		 */
		int money;
		int waterPrice = 5;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please pay for your water");
		money = scan.nextInt(); // whatever money you give me i will store it inside MONEY.
		while (money != waterPrice) {
			if (money > waterPrice) {
				System.out.println("This is too much, you need to enter less money");
				//money = scan.nextInt();
			} else {
				System.out.println("Water is expensive, please insert more money");
				//money = scan.nextInt();

			}
			money = scan.nextInt();

		}
		System.out.println("Enjoy your water");

	}

}
