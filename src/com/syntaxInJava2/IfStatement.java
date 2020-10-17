package com.syntaxInJava2;

public class IfStatement {

	public static void main(String[] args) {
		int num1 = 1800;
		int num2 = 900;
		System.out.println("Writing my first if statement");
		if(num1>num2) {
			System.out.println("Num1 is greater than num2");
		}
		System.out.println("End of if statement");
		
		System.out.println("                           \n");
		int temperature = 90;
		if(temperature > 80) {
			System.out.println(" I am going to the beach");
		}else
			System.out.println(" I will go for a walk ");
		
		System.out.println("                        \n");
		double expectedHours = 20;
		double actualHours = 8;
		if(actualHours>expectedHours ) {
			System.out.println(" You will love the course and you will succeed");
		}else 
			System.out.println("Course will be too hard for you");
		
		
		
		
		
	}

}
