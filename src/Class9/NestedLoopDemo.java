package Class9;

public class NestedLoopDemo {

	public static void main(String[] args) {

		for(int i = 0 ; i<5; i++) { // outer loop always controls the inner loop
			System.out.println("Hello");
			for(int y = 0; y<3; y++) { // inner loop
				System.out.println("Bye");
			}
		}
		System.out.println("---------------more examples---------------");
		for(int i = 10; i<=14 ; i++) {
			for(int j = 1 ; j<=4; j++) {
				System.out.println("i ="+i+" j="+j);
				 
			}
			System.out.println("----------");
		}
		System.out.println("--------how can i print number from 10 to 99 usting nested loop---------");
		
		for(int i = 10; i<=99; i++) {
			System.out.println(i+ " ");
		}
		for(int i = 1 ; i<=9; i++) {
			for(int j = 0 ; j<9; j++) {
				System.out.println(i+" "+j);
			}
		}
		System.out.println("----------------------------how can i print clock--------------------------");

		for(int h = 0 ; h<24; h++) {
			for(int m= 0; m<60; m++) {
				if(m<10 ) {
					System.out.println(h+ ":0" +m);
				}
				System.out.println(h+ ":" +m);
			}
		}
		
	}

}
