package Class8;

public class Class01ForLoops {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.print("Good morning" + " ");
		}
		// i want to say good morning 5 times
		System.out.println("               \n");
		for (int i = 5; i <= 10; i++) {
			System.out.print("Hey" + " ");
		}
		// i want to print number 1 to 100.
		System.out.println("               \n");
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		// It prints 10 to 0.
		System.out.println("           -\n");
		for (int i = 10; i >= 0; i--) {
			System.out.print(i + " ");
		}
	
		for (int i = 0; i<=100; i+=5) {
			System.out.println(i);
		}
	}

}
