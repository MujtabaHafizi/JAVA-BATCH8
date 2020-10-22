package Class8;

import java.util.Scanner;

public class OnlyForLoopsExamples {

	public static void main(String[] args) {

		System.out.println("printing from 1 to 10");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("        \n");
		System.out.println("printing from 1 to 10");
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println("        \n");
		System.out.println("printing even numbers from 2 to 10");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("        \n");
		System.out.println("printing odd numbers from 1 to 10");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("        \n");
		System.out.println("printing numbers from 1 to 60 by 5");
		for (int i = 0; i <= 60; i += 5) {
			System.out.print(i + " ");
		}
		System.out.println("        \n");
		System.out.println("printing numbers from 1 to 30 by 3");
		for (int i = 0; i <= 36; i += 3) {
			System.out.print(i + " ");

		}
		System.out.println("        \n");
		System.out.println("printing numbers from 1 to 30 by 3");
		for (int i = 7; i <= 98; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("        \n");
		System.out.println("printing numbers from 1 to 30 by 3");
		for (int i = 0; i <= 98; i += 7) {
			System.out.print(i + " ");
		}
		
		System.out.println("        \n");
		System.out.println("printing numbers from 1 to 30 by 3");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter which number");
		
		int num1 = scan.nextInt();
		int multiplicaton;
		for(int i=1; i<=10; i++) {
			multiplicaton= num1 * i;
			System.out.println(num1+"x"+i+"="+multiplicaton);
		}
		
		System.out.println("        \n");
		System.out.println("printing Hello 1 time only cause there a break at the end of the coding");
		for (int i = 1; i < 4; i++) {
			System.out.print("Hello");
			break; // it breaks no matter what. it should not have stopped there.
		}
		System.out.println("        \n");
		System.out.println("printing stops before it gets to the number 5");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break; // breaks can be used inside any loop. 
			}
			System.out.print(i+" ");

		}
		System.out.println("        \n");
		System.out.println("It prints from 1 to 10 except number 3 ");
		for (int i = 1; i <= 10; i++) {
			if (i == 3) {
				continue; // It prints from to 1 to 5
			}
			System.out.print(i+" ");// It prints from 1 to 5 except 3.
		}
		System.out.println("        \n");
		System.out.println("It prints from 1 to 10 except number 7 and number 3 ");
		for (int i = 1; i <= 10; i++) {
			if (i == 3 || i == 7) {
				continue; // It prints from to 1 to 5
			}
			System.out.print(i+" ");// It prints from 1 to 5 except 3.
		}
		System.out.println("        \n");
		System.out.println("It prints from 1 to 10 except number 7 and number 3 ");
		int sumEven= 0;
		int sumOdd= 0;
		
		for(int i = 1 ; i<=50; i++) {
			if(i%2!=0) {
				sumOdd = sumOdd + i;
			}else {
				sumEven = sumEven + i;
			}
		}
		System.out.println("The sum of even numbers from 1  to 50 = "+sumOdd);
		System.out.println("The sum of odd numbers from 1  to 50 = "+sumEven);

		
		System.out.println("        \n");
		System.out.println("It prints from 1 to 10 except number 7 and number 3 ");
		
		int sumEven1 = 0;
		int sumOdd1 = 0;
		
		for(int i = 1 ; i <= 50; i++) {
			if(i%2==0) {
				sumEven1 = sumEven1 + i; 
			}else {
				sumOdd1 = sumOdd1 + i ;
			}
		}
		System.out.println("The sum of even numbers from 1  to 50 = "+sumEven1);
		System.out.println("The sum of odd numbers from 1  to 50 = "+sumOdd);
	}
}
