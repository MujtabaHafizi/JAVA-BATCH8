package ReviewClassOct15;

import java.util.Scanner;

public class ReviewClass6Switch {

	public static void main(String[] args) {
		int num1;
		int num2;
		char operatoration;
		int result = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("Please enter the operatrion + - * /");
		operatoration = scan.next().charAt(0);

		if (operatoration == '+') {
			result = num1 + num2;
		} else if (operatoration == '-') {
			result = num1 - num2;

		} else if (operatoration == '*') {
			result = num1 * num2;

		} else if (operatoration == '/') {
			result = num1 / num2;

		} else {
			System.out.println("Invalid Operations");
		}
		System.out.println(result);
		switch (operatoration) {
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
