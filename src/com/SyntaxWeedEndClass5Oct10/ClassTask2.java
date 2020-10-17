package com.SyntaxWeedEndClass5Oct10;

import java.util.Scanner;

public class ClassTask2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your height");
		double height = scan.nextDouble();
		
		if(height<60) {
			System.out.println("Short");
		}else if(height>60 && height<72) {
			System.out.println("Medium");
		}else {
			System.out.println("Tall");
		}
		
	}

}
