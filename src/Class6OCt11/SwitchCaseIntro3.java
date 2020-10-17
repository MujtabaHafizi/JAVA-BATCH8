package Class6OCt11;

import java.util.Scanner;

public class SwitchCaseIntro3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter any day number of the week");
		int day = scan.nextInt();
		
		if(day==1) {
			System.out.println("Today is Monday we have no class");
		}else if(day==2) {
			System.out.println("Today is Tuesday we have Manual class");
		}else if(day==3) {
			System.out.println("Today is Wednesday we have Manual class");
		}else if(day==4) {
				System.out.println("Today is Thursday we have Review class");
		}else if(day==5) {
			System.out.println("Today is Friday we have no class");
		}else if(day==6) {
			System.out.println("Today is Saturday we java  class");
		}else if(day==7) {
			System.out.println("Today is Sunday we have Java class");
		}else {
			System.out.println("This is invalid Entry, please provide vaid day from 1 to 7");

		}
		
	}

}
