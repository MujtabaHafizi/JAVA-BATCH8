package Class10;

public class ClassRecap1 {

	public static void main(String[] args) {
		boolean condition = true;
		for(int i = 1; i<=3 ; i++){
			System.out.println("I am for loop");
			while(condition){
			System.out.println("I am while loop"); //infinite loop
			break; // the will print 3 times.
			}
		}		
	}

}
