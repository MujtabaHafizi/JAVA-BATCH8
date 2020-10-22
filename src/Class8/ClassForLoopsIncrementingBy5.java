package Class8;

public class ClassForLoopsIncrementingBy5 {

	public static void main(String[] args) {

		for(int i = 0; i<=100; i+=5) {
			System.out.print(i+" "); // It prints 0 to 100 by 5s.
		}
		System.out.println("    \n");
		for(int i = 100; i>=0; i-=5) {
			System.out.print(i+" "); // It prints 100 to 0 by 5s.
		}
	}

}
