package Class7;

import java.util.Scanner;

public class Class10DoWhileLoops {

	public static void main(String[] args) {
		// Ask user what is his name 5 times --- hello +name
		Scanner scan = new Scanner(System.in);
		int number = 1;
		while(number<=3) {
			String name;
			System.out.println("Please tell me your name");
			name = scan.next();
			System.out.println("Nice to meet you "+name);
			System.out.println("----------------------");
			number++;
			
		}
		
	}

}
