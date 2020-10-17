package ReviewClassOct15;

import java.util.Scanner;

public class ReviewClass9 {

	public static void main(String[] args) {
	
	String pass = "pass123";
	double accountBalance = 1000;
	Scanner scan = new Scanner(System.in);
	double transferAmount ;
	System.out.println("Welcome to Syntax bank please enter your password");
	pass = scan.nextLine();
	
	if("pass123".equals(pass)) {
		System.out.println("Please enter the amount that you want to transfer");
		transferAmount = scan.nextDouble();
		if(transferAmount>accountBalance) {
			System.out.println("Not enough ");
		}else {
			System.out.println("Transfered remaining balance " +(accountBalance-transferAmount));
		}
	}else {
		System.out.println("Sorry try again Invalid credentials");

	}
		
	}

}
