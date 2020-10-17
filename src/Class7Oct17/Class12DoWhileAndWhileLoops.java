package Class7Oct17;

import java.util.Scanner;

public class Class12DoWhileAndWhileLoops {

	public static void main(String[] args) {
		// play a lottery where we need to enter number from 1 to 20
		// lucky number is 7
		// keep asking a user to enter a number until entered number is lucky is number.

		int numberFromUser;
		int luckyNumber = 7;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter any number form 1 to 100");
		numberFromUser = scan.nextInt();
		while (numberFromUser != luckyNumber) {
			System.out.println("Please enter any number form 1 to 100");
			numberFromUser = scan.nextInt();

		}
		System.out.println("Congratulations you guessed the lucky number " + luckyNumber);
	}

}
