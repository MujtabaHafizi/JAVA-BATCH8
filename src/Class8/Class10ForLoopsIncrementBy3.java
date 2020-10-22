package Class8;

public class Class10ForLoopsIncrementBy3 {

	public static void main(String[] args) {

		System.out.println("it increments by 3 until it reaches 30\n");
		for (int i = 0; i <= 30; i += 3) {
			System.out.print(i + " "); // it increments by 3 until it reaches 30.

		}
		System.out.println("          \n");
		System.out.println("it increments by 3 until it reaches 30\n");
		for (int a = 0; a <= 30; a += 3) {
			System.out.print(a + " ");
		}
		System.out.println("          \n");
		System.out.println("Show the odd numbers from 0 to 50\n");
		for (int x = 0; x <= 50; x++) {
			if (x % 2 != 0) {
				System.out.print(x + " ");
			}
		}
	}

}
