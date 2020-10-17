package Class7Oct17;

public class Class5WhileLoops {

	public static void main(String[] args) {

		int a = 1;
		while (a <1000) {

			System.out.print(a + " ");
			a += 2;
		}

		int b = 1;
		while (b <10) {

			System.out.print(b + " ");
			b += 2;
		}
		
		int c = 100;
		while (c <0) {
			if((c%2)!=0 ) {
				System.out.print(c + " ");
				
			}
			c --;
		}
		
	}

}
