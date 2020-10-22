package Class8;

import java.util.Scanner;

public class Sum1To7UsingWhileAndForLoops {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int userNumber = 0; // it is the user's input
		int sum = 0;

		while (userNumber < 1) {
			System.out.println("Please enter a positive non-zero integer ");
			userNumber = scan.nextInt();
		}

		for (int i = 1; i <= userNumber; i++) { 
			sum = sum + i;
		}

		System.out.println("The sum of numbers from 1 to " + userNumber + " is " + sum);
	}

}
