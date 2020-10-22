package Class9;

public class PrintingPatternsNumber {

	public static void main(String[] args) {

		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= 10; c++) {
				System.out.print(c );
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 7; i>=1 ; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
			System.out.print((i * j) + " ");
			}
			System.out.println();
	}
	}
}
