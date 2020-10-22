package Class6;

import java.util.Scanner;

public class IfNestedIfSales {

	public static void main(String[] args) {


		
		boolean sale;
		double price;
		double discount;
		double finalPrice;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please tell me if you have sale today?");
		sale = scan.nextBoolean();
		
		if(!sale) {
			System.out.println("No shopping");
		}else {
			System.out.println("Please enter the price");
			price = scan.nextDouble();
			
		if(price>=10 && price<50) {
			discount = price * 0.1;
		}else if(price >=50 && price <100) {
			discount = price * 0.2;
		}else if(price >=100 && price <500) {
			discount = price *0.4; // it is 40% discount.
		}else if(price >=500) {
			discount = price *0.5;
		}else {
			discount = 0;
		}
		finalPrice = price - discount;
		System.out.println("Your product is $"+price+" and you get $"+discount+ " discount."+" and you pay only " + finalPrice);
		System.out.println("The final price with the discount is " +(price - discount));
		}
		
	}

}
