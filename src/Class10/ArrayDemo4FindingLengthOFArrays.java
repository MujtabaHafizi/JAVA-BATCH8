package Class10;

public class ArrayDemo4FindingLengthOFArrays {

	public static void main(String[] args) {

		//// how do I know how many elements I have in the array?
		String[] names = { "Mike", "Burju", "Jack", "Danilo", "Bryan", "Ahamd", "Ali", "Qudoos", "Putin",
				" Jimmy Kimmel", "Justin Timberlane", "Kamala Harris", "Matt Damon", "Qadir", "Nazir" };

		int size = names.length;

		System.out.println("Size of names array = " + size);

		System.out.println(names[names.length - 9]); // it prints name number 9 counting from the last name.

		System.out.println(names[names.length / 2]); // It prints that name which makes the number of names split
		
		
		System.out.println("Name number 2 = "+names[names.length-2]); // it prints name number 2 (Qadir) from the last name.

		int i =2;
		System.out.println(names[i]); // Jack = 2
		
		
		i+=2; // I increased i's value to 2 more
		System.out.println(names[i]); // Bryan.
		
		for(int a = 0; a<names.length-1; a++) { // it prints all the names except the last one(Nair);
			System.out.print(names[a]+" ");
		}
		System.out.println();
		System.out.println();
		for(int a = 0; a<names.length-8; a++) { // it doesn't print 8 names starting from the last names.
			System.out.print(names[a]+" ");
		}
		
	} 

}
