package Class8;

public class ClassTask2 {

	public static void main(String[] args) {
		
		System.out.println("------------One Way---------\n");
		for(int i = 20; i>=1; i--) {
			if(i%2==0) {
				System.out.print(i+"-");// It prints even numbers from 20 to 2.
			}
			
			
		}
		System.out.println("           \n");
		System.out.println("------------Another Way---------\n");
		for(int i = 20; i>1; i-=2) {
			System.out.print(i+ "-"); // It prints even numbers from 20 to 2.
		}
		System.out.println("      \n");
		System.out.println("  --old number 20 and 50--             \n");
		for(int i =20; i<=50 ; i++) {
			if(i%2!=0) {
				System.out.println(i+ "-");
			}
		}
		System.out.println("          \n");
		for(int i = 21; i<=50; i+=2) {
			System.out.println(i+ "-");
		}
	}

}
