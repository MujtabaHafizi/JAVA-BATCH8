package Class8;

import java.util.Scanner;

public class ClassDoWhileLoopsWaterPrice {

	public static void main(String[] args) {

		int money;
		int waterPrice = 5;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please pay for your water!");

		do {
			money = scan.nextInt();

			if (money > waterPrice) {
				System.out.println("Thi is too much, you need to insert less money");
			} else if (money < waterPrice) {
				System.out.println("Water is expensive, please insert more money");
			}
		} while (money != waterPrice);
		System.out.println("Please enjoy your water");

	}

}
