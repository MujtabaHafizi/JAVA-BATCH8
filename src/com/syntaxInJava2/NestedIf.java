package com.syntaxInJava2;

public class NestedIf {

	public static void main(String[] args) {

		int num = 69;
		if (num % 2 == 0) {
			System.out.println(" it is an even number");
		} else
			System.out.println("it is an odd number");

		// variable for allergy - yes or no
		// if allergy is yes
		// we will check if pet allergy
		// if peanut allergy.
		// if pollen allergy.

		boolean allergy = true;
		boolean petAllergy = true;

		if (allergy) {
			System.out.println("Lets do further check");
			if (petAllergy) {
				System.out.println("please no cats or dogs in the house");
			} else {
				System.out.println("That is good you do not have pet allergy");
			}
		} else {
			System.out.println("you are lucky"); // you are lucky.
		}
		System.out.println("     Example 2         \n");

		/*
		 * if today is Friday we will watch movie but we would like to check the date if
		 * date is 13 we will watch scary movie and if is not i will watch comedy,
		 * action if not Friday i will study
		 */
		boolean isFriday = false;
		int date = 13;
		boolean monday = true;
		if (isFriday) {
			if (date == 13) {
				System.out.println(" I will watch scary movie");
			} else {
				System.out.println(" I will watch PK moview with amir khan");
			}
		} else {
			System.out.println("Today is not friday, I am studying");
		}
		System.out.println("            Example 3\n");

		/*
		 * Check if assignment is completed if assignment is completed : if score>90 it
		 * means you did a great job if score > 80 it means good job if score <70 it
		 * means please study more
		 */

		int score = 65;
		boolean assignment = false;
		if (assignment) {
			if (score > 90) {
				System.out.println("You did greate!!!!");
			} else if (score > 80) {
				System.out.println("You did good!");
			} else if (score > 70) {
				System.out.println(" You better study more");
			} else {
				System.out.println("Good job for trying but you must study");
			}
		} else {
			System.out.println(" You should always complete all assignments");
		}

	}

}
