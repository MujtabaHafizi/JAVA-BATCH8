package Class9;

public class PrintingPatternsNumber2 {

	public static void main(String[] args) {
		for(int r = 1 ; r<=7; r++) {  // Now it only cares about Row and it only prints Rows. 
			for(int c = 0 ; c<=8; c++) {
				System.out.print(c + r);
			}
			System.out.println();
		}
		
	}

}
