package Class6OCt11;

import java.util.Scanner;

public class LogicalOperators2 {

	public static void main(String[] args) {

		double biggest;
		int number1, number2, number3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter 3 Distinct Numbers");
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		number3 = scan.nextInt();

		if (number1 > number2) { // if num1 grater than num2
			if (number1 > number3) {
				biggest = number1;
			} else {
				biggest = number3;
			}
		} else { // num2 is greater than num1.
			if (number2 > number3) {
				biggest = number2;
			} else {
				biggest = number3;
			}
			System.out.println("The biggest number is "+biggest);
		}
	}

}
