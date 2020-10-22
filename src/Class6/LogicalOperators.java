package Class6;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {

		double num1, num2, num3 , max;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers1");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		
		scan.close();
		
		if(num1>num2 && num1>num3) {
			max = num1;
		}else if(num2>num3) {
			max = num2;
			
		}else {
			max = num3;
		}
		
		System.out.println("The laregest number is " +max);

		
		
		
	}

}


























