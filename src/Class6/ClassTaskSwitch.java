package Class6;

import java.util.Scanner;

public class ClassTaskSwitch {

	public static void main(String[] args) {

		char grade;
		String explanation;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your grade");
		grade = scan.next().charAt(0);
		
		
		switch (grade) {
		case 'A':
			explanation ="Excelling";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Average";
			break;
		case 'D':
			explanation = "Bad";
			break;
			default:
			explanation = "Not acceptable";
			
		}
		System.out.println("Your grade  is "+grade+ " : "+explanation);
	}

}
