package Class8;

import java.util.Scanner;

public class Class02MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter which number");
		
		int num1 = scan.nextInt();
		int multiplicaton;
		for(int i=1; i<=10; i++) {
			multiplicaton= num1 * i;
			System.out.println(num1+"x"+i+"="+multiplicaton);
		}
		
		
	}

}
