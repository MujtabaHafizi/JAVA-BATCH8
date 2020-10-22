package Class8;

public class ClassForLoopAndSum {

	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i <= 6; i++) { 
			if (i % 2 == 0) {
				sum1 = sum1 + i;
			} else {
				sum2 = sum2 + i;
			}

		}
		System.out.println("The sum of even numbers form 1 to 50 = " + sum1);
		System.out.println("The sum of odd numbers form 1 to 50 = " + sum2);
		
		int startPoint, endPoint;
		int sum3 = 0;
		int sum4 = 0;
		for(int i = startPoint  ; i<=endPoint; i++) {
			if(i%2 ==0) {
				sum3 += i;

			}
		}
	}

}
