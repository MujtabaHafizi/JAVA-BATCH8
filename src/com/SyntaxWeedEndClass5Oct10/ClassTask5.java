package com.SyntaxWeedEndClass5Oct10;

import java.util.Scanner;

public class ClassTask5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter Your Quiz Score");
		int quiz = scan.nextInt();
		
		System.out.println("Please Enter Your Mid-Term Score");
		int midTerm = scan.nextInt();
		
		System.out.println("Please Enter Your Final Score");
		int finalScore = scan.nextInt();
		
		int average = (quiz+midTerm+finalScore)/3;
		System.out.println(average);
		
		if(average>=90) {
			System.out.println("Grade is: A");
		}else if(average>=70 && average<90) {
			System.out.println("Grade is : B");
		}else if (average>=50 && average<70) {
			System.out.println("Grade is : C");
		}else if(average>=50 && average<70) {
			System.out.println("Grade is : D");
		}else {
			System.out.println("Grade is : F");
		}
	}

}
