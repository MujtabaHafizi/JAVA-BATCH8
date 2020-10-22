package Class10;

public class LoopRecap {

	public static void main(String[] args) {
		boolean condition = true;
//		while (condition) {
//			System.out.println("I am while loop");
//			for (int i = 1; i < 8; i++) {
//				System.out.println("I am for loop");  // infinite loop
//				break;
//			}
//		}
		for(int i = 1 ; i<=3; i++) {
			System.out.println("I am for loop");
			while(condition) {
				System.out.println("I am while loop");
				break;
			}
		}
	}

}
