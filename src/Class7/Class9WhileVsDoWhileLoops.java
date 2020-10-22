package Class7;

public class Class9WhileVsDoWhileLoops {

	public static void main(String[] args) {
		System.out.println("---------------------while Loop-----------------------------\n");
		int a = 20;
		// first we check condition
		while (a < 15) {
			System.out.println("Hello"); // increment cause 15
			a++;

		}
		System.out.println("----Do while Loop -------\n");
		int b = 20;
		// first do something
		do {
			System.out.println("Hi");
			b++;
		}while(b<15); // then check the condition
	}

}
