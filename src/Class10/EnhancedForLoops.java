package Class10;

public class EnhancedForLoops {

	public static void main(String[] args) {

		String[] cars = { "Toyota", "Lexus", "Jeep", "Honda", "Hyundai", "Mazda" };
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}

		System.out.println();
		System.out.println("------Getting values from array using enhanced for loop-----");
		// enhanced for loop will only with ARRAYS.

		for (String car : cars) {
			System.out.print(car + " "); // it prints all the cars
		}
		System.out.println();
		System.out.println("-------Getting values from array using enhanced for loop---------");

		int[] numbers = { 10, 10, 90, 600, 89, 1000 };
		for (int num : numbers) {
			System.out.print(num + " "); // all the number are saved inside the NUM.
		}
		System.out.println();
		System.out.println("-------Getting values from array using enhanced for loop----------");

		boolean[] arrayOfBoolean = { true, true, false, true };
		for (boolean boo : arrayOfBoolean) {
			System.out.print(boo);

		}
	}

}
