package Class8;

import java.util.Scanner;

public class RecapWithDoWhileLoops {

	public static void main(String[] args) {
		int money;
		int waterPrice = 5;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please pay for your water!");
		// money = scan.nextInt(); // whatever money you give me i will store it inside
		// MONEY.
		do {
			money = scan.nextInt();
			if (money > waterPrice) {
				System.out.println("This is too much, you need to enter less money");

			} else if (money < waterPrice) {
				System.out.println("water is expenseive, you need to insert more money");
			}

		} while (money != waterPrice);
		System.out.println("Please enjoy your water");

	}

}
