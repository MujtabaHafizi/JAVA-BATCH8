package Class8;

public class Class03BreakAndContinue {

	public static void main(String[] args) {

		// break
		for (int i = 1; i < 4; i++) {
			System.out.println("Hello");
			break; // it breaks no matter what. it should not have stopped there.
		}

		// we want to print numbers from 1 to 10.
		// when number is 5 we want to break the loop.
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break; // breaks can be used inside any loop. 
				
			}
			System.out.print(i+" ");
		
		}
	}

}
