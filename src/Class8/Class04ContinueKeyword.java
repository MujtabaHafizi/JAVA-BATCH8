package Class8;

public class Class04ContinueKeyword {

	public static void main(String[] args) {

		// i want to print numbers from 1 to 5 except number 3

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue; // It prints from to 1 to 5
			}
			System.out.print(i+" ");// It prints from 1 to 5 except 3.
		}

		System.out.println(" \n");
		// i want to print numbers from 1 to 10 except number 3 & 7
		for (int i = 1; i <= 10; i++) {
			if (i == 3 || i == 7) {
				continue;// It prints numbers from 1 to 10 except number 3 & 7.
			}
			System.out.print(i+" ");
		}

	}

}
