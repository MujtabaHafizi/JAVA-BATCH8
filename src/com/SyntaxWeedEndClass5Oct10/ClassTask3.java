package com.SyntaxWeedEndClass5Oct10;

import java.util.Scanner;

public class ClassTask3 {

	public static void main(String[] args) {

		
		/*
		 * System.out.println("Please Enter your quiz, mid term and final scores"); int
		 * midTerm = scan.nextInt(); int if(score>=90) { System.out.println("A"); }else
		 * if(score>=70 && score<90) { System.out.println("B"); }else if(score>=50 &&
		 * score<70) { System.out.println("C"); }else if(score<50) {
		 * System.out.println("F"); }
		 */
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your quize score");
		int quiz = scan.nextInt();
		
		System.out.println("Please enter your mid term");
		int mid = scan.nextInt();
		
		System.out.println("Please enter your final score");
		
		int finalScore = scan.nextInt();
		
		int avg = (quiz + mid + finalScore)/3;
		System.out.println(avg);
		char grade;
		if(avg>=90) {
			grade = 'A';
		}else if(avg>=70 && avg<90) {
			grade = 'B';
		}else if(avg>=50 && avg<70) {
		grade = 'C';
		}else if(avg>=40 && avg<50) {
		grade = 'D';
		}else {
		grade = 'F';
		}
		
		// if your grade is A or B -- you are a good student and you are studying a lot.
		System.out.println("Grade is = "+grade);
		if(grade=='A' || grade=='B') {
			System.out.println("You are a good student");
		}else {
			System.out.println("Please study more");
		}
		
		}
	}


