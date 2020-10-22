package Class10;

public class ArrayDemo3 {

	public static void main(String[] args) {
		
		char[] grade = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		
		char firstValue = grade[1];
		// get all values from grade array
		
		for(int i = 0 ; i<grade.length; i++) {
			System.out.print(grade[i]+" ");
		}
		System.out.println();
		System.out.println();
		String[] name = { "Mike", "Burju", "Jack", "Danilo", "Bryan" };
		
		String secondValue = name[1];
		
		for(int i = 0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
	
		
		
		
		for (int i = 0; i < grade.length; i++) {
			char valueFromArray = grade[i];
			System.out.print(valueFromArray);
		}

		String[] names = { "Mike", "Ahamd", "Mahmood", "Khesrow", "Sardar", "Nadeem" };
		String secondValue1 = names[1];


	}

}
