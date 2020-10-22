package Class8;

public class ClassTask {

	public static void main(String[] args) {

		System.out.println("It prints from 1 to 100");
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("             \n");
		System.out.println("It prints even numbers from 20 to 2");
		for (int i = 20; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}

		}
	}
}
