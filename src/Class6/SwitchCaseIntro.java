package Class6;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {

		String today;
		int day;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any number of day of the week");
		day = scan.nextInt();

		switch (day) {
		case 1:
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Friday";
			break;
		case 6:
			today = "Saturday";
			break;
		case 7:
			today = "Sunday";
			break;
		default:
			today = "Invalid Day";
		}
		System.out.println("Today is " + today);
	}

}
