package Class6;

import java.util.Scanner;

public class SwitchAssignment {

	public static void main(String[] args) {

		/*
		 * double num1, double num2, char operator, double result.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("number 1");
		double num1 = scan.nextDouble();
		System.out.println("number 2");
		double num2 = scan.nextDouble();
		double result = 0;
		System.out.println("operator");
		char operator = scan.next().charAt(0);

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("Please enter a valid mathematical operator");
		}
		System.out.println("ANSWER " + result);
	}

}
