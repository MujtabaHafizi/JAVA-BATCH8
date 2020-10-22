package Class10;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// Arrays are container that store data/values of same type. Arrays are fixed in size.
		// I have 5 students in the class and i need to calculate the average score;
		
		int[] grades =new int[5];
		grades[0]= 100;
		grades[1]= 98;
		grades[2]= 80;
		grades[3]= 73;
		grades[4]= 95;
		
		int average = (grades[0]+ grades[1]+ grades[2]+ grades[3]+ grades[4])/5; 
		
		System.out.println("Average score of my studenst = "+average);
		System.out.println(grades[0]);
		
	}

}
