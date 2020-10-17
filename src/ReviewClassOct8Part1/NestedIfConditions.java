package ReviewClassOct8Part1;

import java.util.Scanner;

public class NestedIfConditions {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

		String name = "Mujtaba";
		String pass = "pass1234";
		double accountBalance = 10.25;
		double transferAmount = 8;
		boolean transAllowed= true;
		if(pass.equals("pass1234")) { 
			System.out.println("Wel come to Syntax bank");
		if(transAllowed) {
			System.out.println("Initiating transfer");
		if(transferAmount>accountBalance) {
			System.out.println("Insufficient balance");
		}
		}else
			System.out.println("you are not allowed to transfer");
		}else {
			System.out.println("Invalid Password");
		}
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1>num2) {
			num1 = num2;
		}else {
			num1 = num1;
		}
		if(num1>num3) {
			System.out.println("larges number is " +num1);
		}else {
			System.out.println("larges number is " +num3);
		}
		
	}

}
