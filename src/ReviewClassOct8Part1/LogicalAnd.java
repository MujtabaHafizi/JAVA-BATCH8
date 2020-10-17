package ReviewClassOct8Part1;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		/*
		 * i need to define whether number is entered from user small number is a number
		 * between 1 to 10 medium number is a number between 11 to 100 large number is a
		 * number form 101 to 1000
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any number");
		int number = scan.nextInt();

		if (number > 0 && number <= 10) {
			System.out.println("You entered small number");
		} else if (number > 10 && number <= 100) {
			System.out.println("You entered medium number");
		} else if (number > 100 && number <= 1000) {
			System.out.println("You entered large number");
		}else if(number>1000 && number<=5000) {
			System.out.println("You Entered Super Large number");
		}else {
			System.out.println("Enter a number between greater than 0 and less than and equal to 5000");
		}
	}

}
