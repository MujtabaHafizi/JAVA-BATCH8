package Class6;

public class IfNestedIFs {

	public static void main(String[] args) {

		int num1 = 10 , num2 = 9, num3 = 80 ;
		double biggest;
		if(num1>num2) {
			if(num1>num3) {
				biggest = num1;
				
			}else {
				biggest = num3;
			}
		}else {
			if(num2>num3) {
				biggest = num2;
			}else {
				biggest = num3;
			}
			System.out.println(biggest);
		}
		
	}

}
