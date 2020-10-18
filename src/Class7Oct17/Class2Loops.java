package Class7Oct17;

public class Class2Loops {

	public static void main(String[] args) {

		int time = 15;
		if(time>12) {
		System.out.println("Good day"); // Good Day is printed here casue 12 is smaller than 15.
		}
		
		System.out.println("\n");
		while (time>12) {
		System.out.println("Good day"); // Good Day is printed 3 times
		time--;
		}
		
		System.out.println("\n");
		while (time>2) {
		System.out.println(time); // it never stops printing Good Day
		time--;
	}
		// i want to print number from 1 to 15
		System.out.println("------------------Printing number 1  to 50-------------------\n");

		int num = 0;
		while(num<=15) {
		System.out.println(num);
		num++;
		}
			
		// i want to print number from 10 to 60
		System.out.println("----------------------------Printing number 1  to 50-----------------------\n");
		int  num1 = 10;
		while(num1<=60) {
			System.out.println(num1+" ");
			num1++;
		}
		
		// i want to print number from 100 to 60
		System.out.println("\n");
		int  num2 = 100;
		while(num2>=60) {
			System.out.print(num2+ " ");
			num2--;
		}	
		
		
		
		
		
}
}