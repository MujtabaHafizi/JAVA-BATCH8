package Class6;

import java.util.Scanner;

public class SwitchCaseIntro1 {

	public static void main(String[] args) {
		
		String country;
		String language;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please your original country");
		country = scan.next();
		switch (country) {
		case "Afghanistan":
			language = "Dari";
			break;
		case "Iran":
			language = "Farsi";
			break;
		case "Pakistan":
			language = "Urdo";
			break;
		case "Tajekistan":
			language = "Persian";
			break;
		case "India":
			language = "Hindi";
			break;
		default:
			language = "Not acceptable";
		}
		System.out.println("You are from " + country + " and you can speak " + language);
	}

}
