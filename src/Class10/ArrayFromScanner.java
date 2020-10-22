package Class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {

		// lets ask user how many names he would like to store and store those names.
		// if user asks to store 2 names we should store 2 names.

		String[] names;
		int size;

		Scanner scan = new Scanner(System.in);
		System.out.println("How many names would you like to store?");
		size = scan.nextInt();

		names = new String[size];
		// first loop we are storing the values
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter any name");
			names[i] = scan.next();
		}
		// second for loop we are receiving values from an array.
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
	}

}
