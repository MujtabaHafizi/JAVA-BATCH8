package Class9;

public class PrintingPatternsNumberDecremening {

	public static void main(String[] args) {

		for (int row=5; row>=1; row--) { // we do not care about what is the value of R , as long as it gives 5 rows.
			for (int col=10; col>=1; col--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
