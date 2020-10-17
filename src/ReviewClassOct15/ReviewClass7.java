package ReviewClassOct15;

import java.util.Scanner;

public class ReviewClass7 {

	public static void main(String[] args) {
		
		char operation;
		int result=0;
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two number");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("Please enter the operatrion + - * /");
		operation = scan.next().charAt(0);
		
		switch (operation) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			System.out.println("Invalid Operations");

		}
		System.out.println(result);
	}

}
