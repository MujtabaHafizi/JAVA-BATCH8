package Class8;

public class ClassForLoopsCalculations {

	public static void main(String[] args) {

		int result = 1;
		for (int i = 10; i >= 1; i -= 2) { // If the statement is inside the loop , it will repeat or print block of
											// codes multiple times.
			result *= i;
			System.out.println("Result = " + result); // 10, 80, 480, 1920, 3840
		}
		System.out.println("         \n");
		System.out.println("------Slightly Change. can  make  it quite diffeent------------\n");
		int result1 = 1;
		for (int i = 10; i >= 1; i -= 2) {
			result1 *= i;
		}
		System.out.println("Result = " + result1); // 3840

	}

}
