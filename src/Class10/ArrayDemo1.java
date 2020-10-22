package Class10;

public class ArrayDemo1 {
	public static void main(String[] args) {

		double []array = new double[3];
		array[0]= 12.99;
		array[1]= 10.88;
		
		
		System.out.println("Value of element = "+array[0]);
		
		array[2] = 5.99; // We can always initialize our variables as long as we already have our arrays created.
		System.out.println("The value of last element = "+array[2]);
	
	}
}
