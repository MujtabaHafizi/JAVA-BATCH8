package Class10;

public class ClassTask1 {

	public static void main(String[] args) {

		System.out.println("------------------The First Way------------");
		char[] grades1 = new char[5];
		grades1[0] = 'A';
		grades1[1] = 'B';
		grades1[2] = 'C';
		grades1[3] = 'D';
		grades1[4] = 'E';

		System.out.print(grades1[0] + " ");
		System.out.print(grades1[1] + " ");
		System.out.print(grades1[2] + " ");
		System.out.print(grades1[3] + " ");
		System.out.print(grades1[4] + " ");

		System.out.println();
		System.out.println("------------------The Second Way------------");
		char[] grades = { 'A', 'B', 'C', 'D', 'E' };
		char[] arrayChar1 = new char[5];

		System.out.print(grades[0] + " ");
		System.out.print(grades[1] + " ");
		System.out.print(grades[2] + " ");
		System.out.print(grades[3] + " ");
		System.out.print(grades[4] + " ");

		System.out.println();
		System.out.println("------------------Enhanced For Loop------------");
		for (char score : grades) {
			System.out.print(score + " ");
		}
	}

}
