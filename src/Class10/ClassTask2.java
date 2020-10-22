package Class10;

public class ClassTask2 {

	public static void main(String[] args) {
		
		System.out.println("-----------------The Second Way---------------------------");
		String[] names = { "Mike", "Burju", "Jack", "Danilo", "Bryan","Mujtaba" };
		
		System.out.print(names[0]+" ");
		System.out.print(names[1]+" ");
		System.out.print(names[2]+" ");
		System.out.print(names[3]+" ");
		System.out.print(names[4]+" ");
		System.out.print(names[5]+" ");

		
		System.out.println();
		System.out.println("-----------------First Way---------------------------");
		
		String[] firstName = new String[5];
		
		firstName[0]= "Mike";
		firstName[1]= "Burju";
		firstName[2]= "Danilo";
		firstName[3]= "Bryan";
		firstName[4]= "Mujtaba";
		
		
		System.out.println(firstName[4]);
		System.out.println(firstName[firstName.length-2]);
		
		int i = 2;
		System.out.println(firstName[i]); // Danilo
		
		i+=2;
		System.out.println(firstName[i]); // Mujtaba.
		System.out.println("-------------this is diffeent\n");
		for(int a =0; a<firstName.length;a++) {
			System.out.println(firstName[i]);
		}
		
	}

}
